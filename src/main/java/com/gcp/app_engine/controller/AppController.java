package com.gcp.app_engine.controller;

import com.gcp.app_engine.model.Student;
import com.gcp.app_engine.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring boot";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return appService.getStudents();
    }
}