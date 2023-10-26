package com.HospiTrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospiTrack.entity.Billing;
import com.HospiTrack.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
    @Autowired
    private BillingRepository billingRepository;

    @Override
    public List<Billing> getAllBillings() {
        return billingRepository.findAll();
    }

    @Override
    public Billing getBillingById(Long id) {
        return billingRepository.findById(id).orElse(null);
    }

    @Override
    public Billing createBilling(Billing billing) {
        return billingRepository.save(billing);
    }

    @Override
    public Billing updateBilling(Long id, Billing billing) {
        Billing existingBilling = billingRepository.findById(id).orElse(null);
        if (existingBilling != null) {
            existingBilling.setCost(billing.getCost());
            existingBilling.setBillingDateTime(billing.getBillingDateTime());
            existingBilling.setPatient(billing.getPatient());
            return billingRepository.save(existingBilling);
        }
        return null;
    }

    @Override
    public void deleteBilling(Long id) {
        billingRepository.deleteById(id);
    }
}

