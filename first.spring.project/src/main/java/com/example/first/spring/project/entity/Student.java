package com.example.first.spring.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String className;
	private String name;

	public Student() {

	}
	
	public Student(int id, String name, String className) {
		setId(id);
		setName(name);
		setClassName(className);
	}

	public String getClassName() {
		return className;
	}

	public String getName() {
		return name;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}
}
