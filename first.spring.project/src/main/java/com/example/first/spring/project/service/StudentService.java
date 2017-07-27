package com.example.first.spring.project.service;

import com.example.first.spring.project.dao.StudentDao;
import com.example.first.spring.project.entity.Student;

public class StudentService {
    private StudentDao studentDao;

    public StudentDao getStudentDao(){
	return studentDao;
    }
    
    public Student get(int id) {
	return getStudentDao().get(id);
    }

    public void add(Student student) {
	getStudentDao().add(student);
    }

    public void remove(int id) {
	getStudentDao().remove(id);
    }

    public void update(Student student) {
	getStudentDao().update(student);
    }
}
