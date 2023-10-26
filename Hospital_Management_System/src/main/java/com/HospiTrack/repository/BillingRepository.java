package com.HospiTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HospiTrack.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {
}

