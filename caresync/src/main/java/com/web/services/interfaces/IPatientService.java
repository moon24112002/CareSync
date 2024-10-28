package com.web.services.interfaces;

import com.web.models.Patient;
import java.util.*;

public interface IPatientService {
	public List<Patient> getAllPatients();
	public Patient getPatientById(Long id);
	public Patient addPatient(Patient patient);
	public Patient updatePatient(Patient patient,Long id);

}
