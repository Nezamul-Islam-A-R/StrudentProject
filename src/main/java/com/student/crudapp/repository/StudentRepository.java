package com.student.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.crudapp.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findAll();
	Student findById(int id);
	int deleteById(int id);
}
