package com.example.Student_Management_App;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class studentRepository {
    Map<Integer ,Student> studentDb = new HashMap<>();
    Map<Integer,Teacher> teachersDb = new HashMap<>();
    Map<Integer,List<Integer>> studentTeacherDb = new HashMap<>();

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

    public Teacher getTeacher(String name) {
        for(Integer teacherId : teachersDb.keySet()){
            if(teachersDb.get(teacherId).getName().equals(name)) {
                return teachersDb.get(teacherId);
            }
        }
        return null;
    }

    public List<String> getAllStudent() {
        List<String> students = new ArrayList<>();
        for(Integer id : studentDb.keySet()){
            students.add(studentDb.get(id).getName());
        }
        return students;
    }

    public void addStudentTeacherPair(Integer studentId, Integer teacherId) {
        if(studentDb.containsKey(studentId) && teachersDb.containsKey(teacherId)){
            if(!studentTeacherDb.containsKey(teacherId)){
                studentTeacherDb.put(teacherId, new ArrayList<>());
            }
            studentTeacherDb.get(teacherId).add(studentId);
        }
    }

    public List<String> getStudentByTeacherId(Integer teacherId) {
        List<Integer> studentsIds = studentTeacherDb.get(teacherId);
        List<String> students = new ArrayList<>();
        if (studentsIds != null) {
            for (int studentId : studentsIds) {
                students.add(studentDb.get(studentId).getName());
            }
        }
        return students;

    }
}
