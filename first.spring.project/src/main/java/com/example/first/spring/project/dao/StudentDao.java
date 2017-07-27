package com.example.first.spring.project.dao;

import java.util.*;

import org.springframework.stereotype.Component;

import com.example.first.spring.project.entity.Student;
@Component
public class StudentDao {
	private final HashMap<Integer, Student> students = new HashMap<Integer, Student>();
	private int brojac;

	public StudentDao() {
		brojac = 0;
	}
	
	public HashMap<Integer, Student> getStudents(){
		return students;
	}
	
	public Student get(int id) {
		return students.get(id);
	}

	public void add(Student student) {
		System.out.println("PROBA");
		student.setId(brojac);
		students.put(brojac++, student);
	}

	public void remove(int id) {
		students.remove(id);
	}

	public void update(Student student) {
		students.put(student.getId(), student);
	}
}
