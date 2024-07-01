package com.example.Student_Management_App;

import org.springframework.stereotype.Service;

@Service
public class studentService {

    studentRepository StudentRepository = new studentRepository();
    public Student getStudent(int admNo){
        return StudentRepository.getStudent(admNo);
    }
    public Student getStudentByPathVariable(int admNo) {
        return StudentRepository.getStudentByPathVariable(admNo);
    }

    public String addStudent(Student student) {
        StudentRepository.addStudent(student);
        return "Student added successfully!";
    }
}
