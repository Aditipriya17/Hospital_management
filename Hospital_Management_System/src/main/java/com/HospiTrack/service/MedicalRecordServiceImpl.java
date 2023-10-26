package com.HospiTrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospiTrack.entity.MedicalRecord;
import com.HospiTrack.repository.MedicalRecordRepository;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {
    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Override
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordRepository.findAll();
    }

    @Override
    public MedicalRecord getMedicalRecordById(Long id) {
        return medicalRecordRepository.findById(id).orElse(null);
    }

    @Override
    public MedicalRecord createMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    @Override
    public MedicalRecord updateMedicalRecord(Long id, MedicalRecord medicalRecord) {
        MedicalRecord existingMedicalRecord = medicalRecordRepository.findById(id).orElse(null);
        if (existingMedicalRecord != null) {
            existingMedicalRecord.setDiagnosis(medicalRecord.getDiagnosis());
            existingMedicalRecord.setPrescriptions(medicalRecord.getPrescriptions());
            existingMedicalRecord.setTestResults(medicalRecord.getTestResults());
            existingMedicalRecord.setPatient(medicalRecord.getPatient());
            return medicalRecordRepository.save(existingMedicalRecord);
        }
        return null;
    }

    @Override
    public void deleteMedicalRecord(Long id) {
        medicalRecordRepository.deleteById(id);
    }
}
