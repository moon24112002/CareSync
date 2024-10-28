package com.web.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "doctor")

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dateTime;
	private String name;
	private String specilization;
	private List<String> conditionsCovered;
	private String age;
	@ElementCollection
	@Column(name="conditions")
	public List<String> getConditionsCovered() {
		return conditionsCovered;
	}
	public void setConditionsCovered(List<String> conditionsCovered) {
		this.conditionsCovered = conditionsCovered;
	}
	public Doctor(Long id, LocalDateTime dateTime, String name, String specilization, List<String> conditionsCovered,
			String age, Address address) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.name = name;
		this.specilization = specilization;
		this.conditionsCovered = conditionsCovered;
		this.age = age;
		this.address = address;
	}
	private Address address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Doctor() {
		super();
	}
	

}
