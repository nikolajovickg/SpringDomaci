package com.example.first.spring.project.entity;


public class Student {
    private int id;
    private String className;
    private String name;

    public Student(){
	
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
    
    public void setId(int id){
	this.id = id;
    }
    public int getId(){
	return id;
    }
}
