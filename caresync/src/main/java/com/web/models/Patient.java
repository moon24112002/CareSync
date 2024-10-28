package com.web.models;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime dateTime;
	private String name;
	private int age;
	private String concern;
	
	private Address address;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getConcern() {
		return concern;
	}

	public void setConcern(String concern) {
		this.concern = concern;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Patient() {
		super();
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Patient(Long id, String name, int age, String concern, Address address,LocalDateTime dateTime) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.concern = concern;
		this.address = address;
		this.dateTime = dateTime;
	}
	
}

