package com.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerConfig {
    @GetMapping("/getStr")
    public String getString(){
        return "webTest";
    }
}
