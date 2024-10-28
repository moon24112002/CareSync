package com.web.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.web.models.Address;
import com.web.models.Doctor;

import jakarta.transaction.Transactional;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor,Long> { 
	 @Query("SELECT d FROM Doctor d WHERE :conditionCovered MEMBER OF d.conditionsCovered")
	  List<Doctor> findDoctorsByConditionCovered(@Param("conditionCovered") String conditionCovered);
}
