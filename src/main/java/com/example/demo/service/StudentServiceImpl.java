package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Major;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	
	public List<Student>findStudent(){
		return studentDao.findStudent();
	}
	public List<Major>findMajor(){
		return studentDao.findMajor();
	}
}