package com.capg.demo.demospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.demospring.model.Student;
import com.capg.demo.demospring.repo.StudentDetailsRepo;

@Service
public class StudentDetailsService {
	  @Autowired
		StudentDetailsRepo  Students;
		public Student   findStudentByName(String studentName)
		{
			return  Students.findStudentByName(studentName);
		}
		
		public List<Student> findall() {
			return Students.findall();
		}

		public Student deleteStudentByName(String studentName) {
			return Students.deleteStudentByName(studentName);
		}
		public Student  addStudent(Student student)
		{
			return Students.addStudent(student);
		}
}
