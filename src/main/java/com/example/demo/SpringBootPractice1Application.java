package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Major;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class SpringBootPractice1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringBootPractice1Application.class, args);
		
		StudentService studentService = context.getBean(StudentService.class);
		List<Student> list =studentService.findStudent();
		List<Major> majorList = studentService.findMajor();
		System.out.println("【student】");
		for (Student s: list) {
			System.out.println(s.getStudentInfo());
		}
		System.out.println("【major】");
		
		for (Major m: majorList) {
			System.out.println(m.getMajorInfo());
		}
	}

}
