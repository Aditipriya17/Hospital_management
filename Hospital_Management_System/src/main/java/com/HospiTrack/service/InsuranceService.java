package com.HospiTrack.service;

import java.util.List;

import com.HospiTrack.entity.Insurance;

public interface InsuranceService {
    List<Insurance> getAllInsurances();
    Insurance getInsuranceById(Long id);
    Insurance createInsurance(Insurance insurance);
    Insurance updateInsurance(Long id, Insurance insurance);
    void deleteInsurance(Long id);
}