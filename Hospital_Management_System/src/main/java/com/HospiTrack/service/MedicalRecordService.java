package com.HospiTrack.service;

import java.util.List;

import com.HospiTrack.entity.MedicalRecord;

public interface MedicalRecordService {
    List<MedicalRecord> getAllMedicalRecords();
    MedicalRecord getMedicalRecordById(Long id);
    MedicalRecord createMedicalRecord(MedicalRecord medicalRecord);
    MedicalRecord updateMedicalRecord(Long id, MedicalRecord medicalRecord);
    void deleteMedicalRecord(Long id);
}