package com.HospiTrack.service;

import java.util.List;

import com.HospiTrack.entity.Test;

public interface TestService {
    List<Test> getAllTests();
    Test getTestById(Long id);
    Test createTest(Test test);
    Test updateTest(Long id, Test test);
    void deleteTest(Long id);
}
