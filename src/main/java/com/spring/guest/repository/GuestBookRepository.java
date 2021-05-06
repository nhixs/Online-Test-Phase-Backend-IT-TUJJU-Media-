package com.spring.guest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.guest.model.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Long> {

	@Query("SELECT g FROM GuestBook g WHERE g.name LIKE %?1%"
			+ " OR g.noKtp LIKE %?1%"
			+ " OR g.email LIKE %?1%"
			+ " OR g.age LIKE %?1%"
			+ " OR g.gender LIKE %?1%"
			+ " OR g.address LIKE %?1%"
			+ " OR CONCAT (g.address,'') LIKE %?1%")
	public List<GuestBook> search(String keyword);
}
