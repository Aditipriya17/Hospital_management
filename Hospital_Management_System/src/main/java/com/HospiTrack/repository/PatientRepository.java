package com.HospiTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HospiTrack.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
