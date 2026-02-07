package com.example.student_management_Api.controller;

import com.example.student_management_Api.model.Student;
import com.example.student_management_Api.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {  

    private final StudentService service;

    public StudentController(StudentService service) {  
        this.service = service;
    }

    // POST /students - add student
    @PostMapping
    public Student addStudent(@RequestBody Student s) {
        return service.addStudent(s);
    }

    // GET /students - get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // GET /students/{id} - get one student
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // PUT /students/{id} - update student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student s) {
        return service.updateStudent(id, s);
    }

    // DELETE /students/{id} - delete student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        boolean deleted = service.deleteStudent(id);
        if (deleted) {
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }
}
