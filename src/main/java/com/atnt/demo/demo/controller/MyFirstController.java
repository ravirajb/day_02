package com.atnt.demo.demo.controller;


import com.atnt.demo.demo.basics.Address;
import com.atnt.demo.demo.basics.Student;
import com.atnt.demo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class MyFirstController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/api/v1/students/{id}")
    public ResponseEntity<?> getAllStudents(@PathVariable int id,
                                            @RequestParam boolean includeAlumni) {
        HttpHeaders responseHeaders = new HttpHeaders();
        Map<String, Object> response = new HashMap<>();

        Student student = studentService.getStudent(id);
/*
        List<Student> students = new ArrayList<>();

        Student ravi = new Student();
        ravi.setFirstName("Ravi");
        ravi.setLastName("Raj");

        Address address = new Address();
        address.setStreet("1st Ave");
        address.setArea("New Jersey");
        ravi.setAddress(address);

        Student sergi = new Student();
        sergi.setFirstName("Ravi");
        sergi.setLastName("Raj");

        Address sergiAddress = new Address();
        sergiAddress.setStreet("1st Ave");
        sergiAddress.setArea("New Jersey");
        sergi.setAddress(sergiAddress);

        students.add(ravi);
        students.add(sergi);*/


        //ist<CountryStateMapping> mapping = springReferenceDataService.getCountryStateMapping();
        response.put("student", student);
        return new ResponseEntity<>(response, responseHeaders, HttpStatus.OK);
    }


}
