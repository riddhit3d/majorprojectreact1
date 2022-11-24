package com.cybage.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.model.Patient;
//
//import com.cybage.entity.Patient;







public interface PatientRepository extends JpaRepository<Patient, Integer>{

}

