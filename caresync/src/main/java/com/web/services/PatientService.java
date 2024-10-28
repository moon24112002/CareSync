package com.web.services;
import java.util.List;

import com.web.models.Patient;
import com.web.services.interfaces.*;
import com.web.repository.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements IPatientService {
	@Autowired
	IPatientRepository _patientRepository;

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return _patientRepository.findAll();
		//return null;
	}

	@Override
	public Patient getPatientById(Long id) {
		// TODO Auto-generated method stub
		Optional<Patient> op =  _patientRepository.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}
	
	@Override
	public Patient addPatient(Patient patient) {
		return _patientRepository.save(patient);
		//return null;
	}

	@Override
	public Patient updatePatient(Patient patient, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
