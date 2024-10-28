package com.web.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.web.models.Doctor;
import com.web.services.interfaces.IDoctorService;

@RestController
public class DoctorController {
	@Autowired
	private IDoctorService _doctorService;
	
	@PostMapping("/doctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return _doctorService.addDoctor(doctor);
	}
	
	@GetMapping("/doctor/{id}")
	public Doctor getDoctorById(@RequestParam Long id) {
		return _doctorService.getDoctorById(id);	
	}
	
	@GetMapping("/doctor")
	public List<Doctor> getAllDoctors(){
		return _doctorService.getAllDoctors();
	}
	
	@PutMapping("/doctor/{id}")
	public Doctor updateDoctor(@RequestParam Long id, @RequestBody Doctor doctor) {
		return _doctorService.updateDoctor(doctor, id);
	}
	
	@GetMapping("/doctor/{issues}")
	public List<Doctor> findDoctorByIssues(@RequestParam String issues){
		return _doctorService.findDoctorsByIssues(issues);
	}
	

}
