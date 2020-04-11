package com.capg.demo.demospring.repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.capg.demo.demospring.model.Student;

@Repository
public class StudentDetailsRepo {
	
	

		Map<Integer,Student >  map = new HashMap<>();
		
		public StudentDetailsRepo() {
			
			Student  e1= new Student(100,"Rebeca",LocalDate.of(1999, 04, 16));
			Student  e2= new Student(101,"chitti",LocalDate.of(1998, 02, 24));
			map.put(100, e1);
			map.put(101, e2);
		}
		
		public List<Student> findall() {
			Collection<Student> values = map.values();
			List<Student>   list = new ArrayList<>(values);
			return list;
		}

		public Student   findStudentByName(String studentName)
		{
			return map.get(studentName);
		}
		
		public  Student deleteStudentByName(String studentName)
		{
			return  map.remove(studentName);
		}
		
		public Student  addStudent(Student student)
		{
			map.put(student.getStudentId(), student);
			
			return student ;
		}
}
