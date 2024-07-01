package com.example.Student_Management_App;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class studentController {
    studentService StudentService = new studentService();
    //API endpoints
    @GetMapping("/get-student") // https://www.student-app.com/getStudent?id=1000
    public Student getStudent(@RequestParam("id") int admNo){
        return StudentService.getStudent(admNo);
    }

    @GetMapping("/get-student-by-path/{id}") // https://www.student-app.com/get-student-by-path/1000
    public Student getStudentByPathVariable(@PathVariable("id") int admNo){
        return StudentService.getStudentByPathVariable(admNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return StudentService.addStudent(student);
    }
}
