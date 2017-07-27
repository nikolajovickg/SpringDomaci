package com.example.first.spring.project.controller;

import com.example.first.spring.project.entity.Student;
import com.example.first.spring.project.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class StudentController {
    private StudentService studentService;

    public StudentService getStudentService() {
	return studentService;
    }
    @RequestMapping(name="/students", method = RequestMethod.POST)
    public boolean add(@RequestBody Student student) {
	System.out.println(student.getName());
	return true;
	//	getStudentService().add(student);
    }

    public void update(Student student) {
	getStudentService().update(student);
    }

    public Student get(int id) {
	return getStudentService().get(id);
    }

    public void remove(int id) {
	getStudentService().remove(id);
    }
}
