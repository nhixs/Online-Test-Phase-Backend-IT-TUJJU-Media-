package com.spring.guest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.guest.model.GuestBook;
import com.spring.guest.repository.GuestBookRepository;

@Service
@Transactional
public class GuestBookService {
	
	
	@Autowired
	private GuestBookRepository repo; //dependency injection from repository interface
	
	public List<GuestBook> listAll(String keyword){ //method to array list guest data table
		if(keyword != null) {
			return repo.search(keyword);
		}
		return repo.findAll();
	}
	
	public void save(GuestBook guestBook) { //method to insert data in the database
		repo.save(guestBook);
	}
	
	public GuestBook get(long id) {
		return repo.findById(id).get(); // to get specific data with id parameter
	}
	
	public void delete(long id) {
		repo.deleteById(id); // to delete specific data by id
	}
	
}
