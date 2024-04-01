package com.example.ormjee.repository;

import com.example.ormjee.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long>
{

}
