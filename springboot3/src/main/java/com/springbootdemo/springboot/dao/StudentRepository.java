package com.springbootdemo.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdemo.springboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
