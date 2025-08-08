package com.dev.guru.developerguru.controller;

import com.dev.guru.developerguru.entity.Student;
import com.dev.guru.developerguru.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public ResponseEntity<List<Student>> getStudentList() {
        List<Student> studList = studentService.getStudents();
        return ResponseEntity.ok().body(studList);
    }

    @GetMapping("/sid/{sid}")
    public ResponseEntity<Student> getStudent(@PathVariable("sid") int sid) {
        Student stud = studentService.getStudent();
        return ResponseEntity.ok().body(stud);
    }
}
