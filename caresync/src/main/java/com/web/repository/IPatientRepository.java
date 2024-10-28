package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.models.Patient;

public interface IPatientRepository extends JpaRepository<Patient,Long> {

}
