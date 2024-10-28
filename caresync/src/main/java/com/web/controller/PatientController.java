package com.web.controller;
import com.web.services.interfaces.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.web.models.*;
import java.util.*;

@RestController
public class PatientController {
	@Autowired
	private IPatientService _patientService;
	
	@PostMapping("/patient")
	public Patient addPatient(@RequestBody Patient patient) {
		
		
		var registredPatient =  _patientService.addPatient(patient);
		
		
		return null;
	}
	
	@GetMapping("/patient")
	public List<Patient> getAllPatient(){
		return _patientService.getAllPatients();
	}
	
	@GetMapping("/patient/{id}")
	public Patient getAllPatient(@PathVariable Long id){
		return _patientService.getPatientById(id);
	}
	
	
	
}
