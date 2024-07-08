package com.example.Student_Management_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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
    @GetMapping("/get-all-students")
    public ResponseEntity<List<String>> getAllStudent(){
        List<String> students = StudentService.getAllStudent();
        return new ResponseEntity(students,HttpStatus.FOUND);
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
    @GetMapping("/get-teacher/{name}")
    public ResponseEntity<Teacher> getTeacher(@PathVariable("name") String name){
        Teacher teacher = StudentService.getTeacher(name);
        return new ResponseEntity(teacher,HttpStatus.FOUND);
    }
    @PutMapping("/add-student-teacher-pair")
    public ResponseEntity<String> addStudentTeacherPair(@RequestParam Integer teacherId,
                                                        @RequestParam Integer studentId){
        StudentService.addStudentTeacherPair(studentId, teacherId);
        return new ResponseEntity("Student Teacher Pair added successfully",HttpStatus.CREATED);
    }
    @GetMapping("/get-student-by-teacher-id/{teacherId}")
    public ResponseEntity<List<String>> getStudentByTeacherId(@PathVariable Integer teacherId){
        List<String> student = StudentService.getStudentByTeacherId(teacherId);
        return new ResponseEntity<>(student,HttpStatus.FOUND);
    }
}
