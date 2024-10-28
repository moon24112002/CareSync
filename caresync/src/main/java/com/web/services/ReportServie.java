package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.models.Report;
import com.web.repository.IReportRepository;
import com.web.services.interfaces.IReportService;

@Service
public class ReportServie implements IReportService {
	
	@Autowired
	private IReportRepository _reportRepository;

	@Override
	public Report createReport(Report report) {
		// TODO Auto-generated method stub
		return _reportRepository.save(report);
	}

	@Override
	public Report updateReport(Report report, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Report findByReportId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Report> findReportByPatientId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Report> findReportByDoctorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
