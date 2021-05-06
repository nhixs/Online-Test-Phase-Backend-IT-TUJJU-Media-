package com.spring.guest.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.spring.guest.model.GuestBook;
import com.spring.guest.service.GuestBookService;
import com.spring.guest.util.FileUtil;

@Controller
public class GuestBookController {

	@Autowired
	private GuestBookService service; // dependency injection from BookService class

	@RequestMapping("/")
	public String viewHomePage(Model model, @Param("keyword") String keyword) {
		List<GuestBook> listGuest = service.listAll(keyword);
		model.addAttribute("listGuest", listGuest);
		model.addAttribute("keyword", keyword);
		return "index";
	}

	@RequestMapping("/new")
	public String newGuesPage(Model model) {
		GuestBook guestBook = new GuestBook();
		model.addAttribute("guest", guestBook);

		return "new_guest";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveGuest(@ModelAttribute("guest") GuestBook guestBook,
			@RequestParam("image") MultipartFile multipartFile) throws IOException {
			String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
			guestBook.setPhotos(fileName);
			GuestBook savedGuest = service.save(guestBook);
			
			String uploadDir = "guest-photos/" + savedGuest.getId();
			FileUtil.saveFile(uploadDir, fileName, multipartFile);
			
		return "redirect:/";
	}

}
