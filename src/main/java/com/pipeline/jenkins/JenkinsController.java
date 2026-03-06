package com.pipeline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {
    @GetMapping("welcome")
    public String Welcome(){

        return "welcome to jenkins user Krishna";
    }
    @GetMapping("welcome2")
    public String Welcome2(){

        return "welcome to jenkins user Krishna";
    }
}
