package com.atnt.demo.demo.service;

import com.atnt.demo.demo.basics.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = Arrays.asList(new Student(1, "Ravi", "Raj"),
            new Student(2, "Sergi", "Sergi"));

    public Student getStudent(int id) {
        for (Student student: students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
