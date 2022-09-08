package com.galaxy.heros.service.impl;

import com.galaxy.heros.feign.TestClient;
import com.galaxy.heros.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private final TestClient testClient;

    public TestServiceImpl(TestClient testClient) {
        this.testClient = testClient;
    }

    @Override
    public String hello() {
        return testClient.test();
    }
}
