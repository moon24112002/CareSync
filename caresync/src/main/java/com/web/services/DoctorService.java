package com.web.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.models.Doctor;
import com.web.models.Patient;
import com.web.repository.IDoctorRepository;
import com.web.services.interfaces.IDoctorService;

import jakarta.transaction.Transactional;

@Service
public class DoctorService implements IDoctorService {
	
	@Autowired
	private IDoctorRepository _doctorRepository;
	

//	DoctorService(IDoctorRepository _doctorRepository){
//		this._doctorRepository = _doctorRepository;
//	}
	
	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return _doctorRepository.findAll();
		//return null;
	}

	@Override
	public Doctor getDoctorById(Long id) {
		// TODO Auto-generated method stub
		Optional<Doctor> op =   _doctorRepository.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
			
		return null;
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return _doctorRepository.save(doctor);
		//return null;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor,Long id) {
		// TODO Auto-generated method stub	
		var temp = _doctorRepository.findById(id);
		if(temp.isPresent()) {
			var tDoctor = temp.get();
			doctor.setId(id);
			doctor.setAddress(doctor.getAddress()!=null?doctor.getAddress():tDoctor.getAddress());
			doctor.setAge(doctor.getAge()!=null?doctor.getAge():tDoctor.getAge());
			doctor.setName(doctor.getName()!=null?doctor.getName():tDoctor.getName());
			doctor.setSpecilization(doctor.getSpecilization()!=null?doctor.getSpecilization():tDoctor.getSpecilization());
			var conditionList= tDoctor.getConditionsCovered();	
			if(doctor.getConditionsCovered().size()>0) {
				conditionList.addAll(doctor.getConditionsCovered());
			}
			doctor.setConditionsCovered(conditionList);
			return _doctorRepository.save(doctor);
		}
		return null;
		
	}

	@Override
	public List<Doctor> findDoctorsByIssues(String issues) {
		// TODO Auto-generated method stub
		return _doctorRepository.findDoctorsByCondition(issues);
		//return null;
	}
}



