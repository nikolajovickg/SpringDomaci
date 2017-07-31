package com.example.first.spring.project.dao;

import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.first.spring.project.entity.Student;
@Component
public interface StudentDao extends CrudRepository<Student, Integer> {
}
