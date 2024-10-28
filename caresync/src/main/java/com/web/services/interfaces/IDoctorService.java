package com.web.services.interfaces;

import java.util.List;

import com.web.models.*;

public interface IDoctorService {
	public List<Doctor> getAllDoctors();
	public Doctor getDoctorById(Long id);
	public Doctor addDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor,Long id);
	public List<Doctor> findDoctorsByIssues(String issues);

}
