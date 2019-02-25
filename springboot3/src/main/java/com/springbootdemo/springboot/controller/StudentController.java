package com.springbootdemo.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.springboot.dao.StudentRepository;
import com.springbootdemo.springboot.entity.Student;

@RestController
@RequestMapping("/app")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		
		List<Student> students=studentRepository.findAll();
		return students;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id){
		
		//Student student=studentRepository.getOne(id);
		Optional <Student> std=studentRepository.findById(id);
		Student student=std.get();
		
		return student;
	}
	
	
}
