package com.web.models;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="report")
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String doctorId;
	private String patientId;
	private LocalDateTime appointment;
	private String prescription;
	
	
	
	

}
