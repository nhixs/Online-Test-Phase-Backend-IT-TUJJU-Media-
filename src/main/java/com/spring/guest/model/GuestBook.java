package com.spring.guest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_tamu")
public class GuestBook {
	
	private Long id;
	private String name;
	private String noKtp;
	private String email;
	private int age;
	private String gender;
	private String address;
	private String destination;
	
	public GuestBook() {
		
	}
	
	

	public GuestBook(Long id, String name, String noKtp, String email, int age, String gender, String address,
			String destination, String photos) {
		super();
		this.id = id;
		this.name = name;
		this.noKtp = noKtp;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.destination = destination;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNoKtp() {
		return noKtp;
	}

	public void setNoKtp(String noKtp) {
		this.noKtp = noKtp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}	
	
}
