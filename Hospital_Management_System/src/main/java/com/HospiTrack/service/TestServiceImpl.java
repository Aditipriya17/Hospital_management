package com.HospiTrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospiTrack.entity.Test;
import com.HospiTrack.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestRepository testRepository;

    @Override
    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    @Override
    public Test getTestById(Long id) {
        return testRepository.findById(id).orElse(null);
    }

    @Override
    public Test createTest(Test test) {
        return testRepository.save(test);
    }

    @Override
    public Test updateTest(Long id, Test test) {
        Test existingTest = testRepository.findById(id).orElse(null);
        if (existingTest != null) {
            existingTest.setName(test.getName());
            existingTest.setDescription(test.getDescription());
            existingTest.setCost(test.getCost());
            return testRepository.save(existingTest);
        }
        return null;
    }

    @Override
    public void deleteTest(Long id) {
        testRepository.deleteById(id);
    }
}
