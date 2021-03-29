package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.PatientDetails;

public interface PatientDetailsRepository extends JpaRepository<PatientDetails, Long> {

	List<PatientDetails> findAll();
	PatientDetails findByName(String name);
}
