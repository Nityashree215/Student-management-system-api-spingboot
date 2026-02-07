package com.example.student_management_Api.service;

import com.example.student_management_Api.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service   // ✅ IMPORTANT: This tells Spring to create a bean
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public Student addStudent(Student s) {
        students.add(s);
        return s;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public Student updateStudent(int id, Student updated) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId() == id) {
                s.setName(updated.getName());
                s.setCgpa(updated.getCgpa());
                return s;
            }
        }
        return null;
    }

    public boolean deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}