package com.example.Student_Management_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
//    studentRepository StudentRepository = new studentRepository();
    @Autowired
    studentRepository StudentRepository;
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

    public String addTeacher(Teacher teacher) {
        StudentRepository.addTeacher(teacher);
        return "Teacher added successfully";
    }

    public Teacher getTeacher(String name) {
        return StudentRepository.getTeacher(name);
    }

    public List<String> getAllStudent() {
        return StudentRepository.getAllStudent();
    }

    public void addStudentTeacherPair(Integer studentId, Integer teacherId) {
        StudentRepository.addStudentTeacherPair(studentId,teacherId);
    }

    public List<String> getStudentByTeacherId(Integer teacherId) {
        return StudentRepository.getStudentByTeacherId(teacherId);
    }
}
