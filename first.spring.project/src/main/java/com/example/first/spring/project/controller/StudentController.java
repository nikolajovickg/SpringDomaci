package com.example.first.spring.project.controller;

import com.example.first.spring.project.entity.*;
import com.example.first.spring.project.service.StudentService;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class StudentController {
	@Autowired
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	@RequestMapping(name = "/students", method = RequestMethod.POST)
	public boolean add(@RequestBody Student student) {
			getStudentService().add(student);
			return true;

	}

	@RequestMapping(value = "/students", method = RequestMethod.PUT)
	public void update(@RequestBody Student student) {
		getStudentService().update(student);
	}

	@RequestMapping(value = "/proba", method = RequestMethod.GET)
	public String debug() {
		System.out.println("RADI");
		return "RADI";
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public Student get(@PathVariable("id") int id) {
		System.out.println(getStudentService().getStudents());
		return getStudentService().get(id);
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public HashMap<Integer, Student> getStudenti() {
		return getStudentService().getStudents();
	}
	@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
	public void remove(@PathVariable("id") int id) {
		getStudentService().remove(id);
	}
}
