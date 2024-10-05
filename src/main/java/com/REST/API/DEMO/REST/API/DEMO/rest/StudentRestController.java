package com.REST.API.DEMO.REST.API.DEMO.rest;

import com.REST.API.DEMO.REST.API.DEMO.Util.Student;
import jakarta.annotation.PostConstruct;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;
    @PostConstruct
    public void loadStudents() {
        students = new ArrayList<>();
        students.add(new Student("Poornima", "Patel"));
        students.add(new Student("Mario", "Rossi"));
        students.add(new Student("Mary", "Smith"));
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentID}")
    public Student getStudents(@PathVariable int studentID){

        if(studentID > students.size() || studentID < 0){
            throw new StudentNotFoundException("Student not found"+ studentID);
        }
        return students.get(studentID);
    }





}
