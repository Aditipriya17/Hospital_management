package com.HospiTrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospiTrack.entity.Insurance;
import com.HospiTrack.repository.InsuranceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService {
    @Autowired
    private InsuranceRepository insuranceRepository;

    @Override
    public List<Insurance> getAllInsurances() {
        return insuranceRepository.findAll();
    }

    @Override
    public Insurance getInsuranceById(Long id) {
        return insuranceRepository.findById(id).orElse(null);
    }

    @Override
    public Insurance createInsurance(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    @Override
    public Insurance updateInsurance(Long id, Insurance insurance) {
        Insurance existingInsurance = insuranceRepository.findById(id).orElse(null);
        if (existingInsurance != null) {
            existingInsurance.setPolicyNumber(insurance.getPolicyNumber());
            existingInsurance.setCoverageAmount(insurance.getCoverageAmount());
            existingInsurance.setPatient(insurance.getPatient());
            return insuranceRepository.save(existingInsurance);
        }
        return null;
    }

    @Override
    public void deleteInsurance(Long id) {
        insuranceRepository.deleteById(id);
    }
}

