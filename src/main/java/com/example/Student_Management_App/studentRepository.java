package com.example.Student_Management_App;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class studentRepository {
    Map<Integer ,Student> studentDb = new HashMap<>();
    Map<Integer,Teacher> teachersDb = new HashMap<>();

    public Student getStudentByPathVariable(int admNo) {
        return studentDb.get(admNo);
    }
    public Student getStudent(int admNo){
        return studentDb.get(admNo);
    }

    public void addStudent(Student student) {
        studentDb.put(student.getAdmNo(), student);
    }

    public void addTeacher(Teacher teacher) {
        teachersDb.put(teacher.getId(),teacher);
    }
}
