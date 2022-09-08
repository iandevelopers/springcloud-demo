package com.galaxy.heros.controller;

import com.galaxy.heros.api.TestApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestApi {

    public String test() {
        return "test789";
    }
}
