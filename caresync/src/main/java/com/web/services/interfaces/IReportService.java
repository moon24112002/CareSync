package com.web.services.interfaces;

import com.web.models.Report;
import java.util.*;

public interface IReportService {
	public Report createReport(Report report);
	public Report updateReport(Report report,Long id);
	public Report findByReportId(Long id);
	public List<Report> findReportByPatientId(Long id);
	public List<Report> findReportByDoctorId(Long id);
	
	

}
