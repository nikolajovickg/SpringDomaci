package com.example.first.spring.project.dao;

import java.util.*;

import com.example.first.spring.project.entity.Student;

public class StudentDao {
    private final HashMap<Integer, Student> students = new HashMap<Integer, Student>();
    private int brojac;
    
    public StudentDao() {
	brojac = 0;
    }

    public Student get(int id) {
	return students.get(id);
    }

    public void add(Student student) {
	students.put(brojac++, student);
    }

    public void remove(int id) {
	students.remove(id);
    }

    public void update(Student student) {
	students.put(student.getId(), student);
    }
}
