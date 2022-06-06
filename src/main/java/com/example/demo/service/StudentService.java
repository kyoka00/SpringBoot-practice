package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Major;
import com.example.demo.entity.Student;


public interface StudentService {
	
	public List<Student>findStudent();
	public List<Major> findMajor();
}

