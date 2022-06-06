package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Major;
import com.example.demo.entity.Student;

@Repository
public class PgStudentDao implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<Student>findStudent(){
		 return jdbcTemplate.query("select s.student_id, s.student_name, s.grade, s.hometown, s.major_id, m.major_name from student s join major m on s.major_id= m.major_id order by s.student_id limit 3", 
			        new BeanPropertyRowMapper<Student>(Student.class));
	}
	
	public List<Major>findMajor(){
		 return jdbcTemplate.query("select * from major order by major_id limit 3", 
			        new BeanPropertyRowMapper<Major>(Major.class));
	}
}
