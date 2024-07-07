package com.example.Student_Management_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class studentController {
//    studentService StudentService = new studentService();
    //API endpoints
    @Autowired
    studentService StudentService;
    @GetMapping("/get-student") // https://www.student-app.com/getStudent?id=1000
    public ResponseEntity getStudent(@RequestParam("id") int admNo){
        Student student = StudentService.getStudent(admNo);
        return new ResponseEntity(student, HttpStatus.OK);
    }

    @GetMapping("/get-student-by-path/{id}") // https://www.student-app.com/get-student-by-path/1000
    public ResponseEntity getStudentByPathVariable(@PathVariable("id") int admNo){
        Student student= StudentService.getStudentByPathVariable(admNo);
        return new ResponseEntity(student, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student student){
        String msg = StudentService.addStudent(student);
        return new ResponseEntity(msg, HttpStatus.CREATED);
    }

    @PostMapping("/add-teacher")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher){
        String msg = StudentService.addTeacher(teacher);
        return new ResponseEntity(msg ,HttpStatus.CREATED);
    }
}
