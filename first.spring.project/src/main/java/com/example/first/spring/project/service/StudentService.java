package com.example.first.spring.project.service;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.first.spring.project.dao.StudentDao;
import com.example.first.spring.project.entity.Student;

@Component
public class StudentService {
	@Resource
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public Iterable<Student> getStudents(){
		return getStudentDao().findAll();
	}
	public Student get(int id) {
		return getStudentDao().findOne(id);
	}

	public void add(Student student) {
		getStudentDao().save(student);
	}

	public void remove(int id) {
		getStudentDao().delete(id);
	}

	public void update(Student student) {
		getStudentDao().save(student);
	}
}
