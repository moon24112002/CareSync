package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.web.models.Report;
import com.web.services.interfaces.IReportService;

@RestController
public class ReportController {	
	@Autowired
	private IReportService _reportService;
	
	@PostMapping("/report")
	public Report createReport(@RequestBody Report report) {
	 return _reportService.createReport(report);	
	}
	
	@GetMapping("/report/doctor/{id}")
	public List<Report> getReportByDoctorId(@RequestParam Long id){
		return _reportService.findReportByDoctorId(id);
	}
	
	@GetMapping("/report/patient/{id}")
	public List<Report> getReportByPatientId(@RequestParam Long id){
		return _reportService.findReportByPatientId(id);
	}
}
