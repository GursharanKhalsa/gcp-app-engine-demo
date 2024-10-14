package com.gcp.app_engine.service;

import com.gcp.app_engine.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppService {

    public static List<Student> students = new ArrayList<>();

    static {
        students.add(Student.builder().id(1).firstName("John").lastName("Doe").country("USA").build());
        students.add(Student.builder().id(2).firstName("Gursharan").lastName("Singh").country("India").build());
        students.add(Student.builder().id(3).firstName("Ram").lastName("Kumar").country("USA").build());
        students.add(Student.builder().id(4).firstName("Tom").lastName("Brown").country("CANADA").build());
        students.add(Student.builder().id(5).firstName("Peter").lastName("White").country("Australia").build());
    }

    public List<Student> getStudents() {
        return students;
    }
}