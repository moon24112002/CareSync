package com.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.models.Report;

@Repository
public interface IReportRepository extends JpaRepository<Report,Long> {

//	@Query("SELECT * FROM Report e WHERE e.DoctorId=:id")
//	List<Report> reportByDoctorId(@RequestParam Long id);
}
