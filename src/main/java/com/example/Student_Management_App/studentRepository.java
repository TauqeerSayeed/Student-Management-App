package com.example.Student_Management_App;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class studentRepository {
    Map<Integer ,Student> studentDb = new HashMap<>();

    public Student getStudentByPathVariable(int admNo) {
        return studentDb.get(admNo);
    }
    public Student getStudent(int admNo){
        return studentDb.get(admNo);
    }

    public void addStudent(Student student) {
        studentDb.put(student.getAdmNo(), student);
    }
}
