package com.cybage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Patient;
import com.cybage.repository.PatientRepository;




@Service
@Transactional
public class PatientService {

	@Autowired
	PatientRepository patientRepository;

	public void addPatient(Patient passenger) {
		
		patientRepository.save(passenger);
		
	}

	public List<Patient> getPatientList() {
		return patientRepository.findAll();
	}
	
	
	
}
