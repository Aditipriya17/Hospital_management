package com.HospiTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HospiTrack.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
}

