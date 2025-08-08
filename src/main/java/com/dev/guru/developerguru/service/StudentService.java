package com.dev.guru.developerguru.service;

import com.dev.guru.developerguru.entity.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private Logger log = LogManager.getLogger(StudentService.class);

    public Student getStudent() {
        Student s = Student.builder().
                sid(101).name("Ganesh").age(22).gender("Male").build();
        return s;
    }

    public Student getStudentByName(String name) {
        Student s = null;
        try {
            Student.builder().
                    sid(101).name("Ganesh").age(22).gender("Male").build();
        } catch (Exception e) {
            log.error("Exception :- {}", e.getMessage());
        }
        return s;
    }

    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        Student s1 = Student.builder().
                sid(101).name("Ganesh").age(22).gender("Male").build();
        Student s2 = Student.builder().
                sid(102).name("Kartik").age(23).gender("Male").build();
        Student s3 = Student.builder().
                sid(103).name("Bharati").age(21).gender("Female").build();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        return studentList;
    }

}
