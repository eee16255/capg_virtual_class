package com.capg.demo.demospring.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.demospring.model.Student;
public interface StudentDetailsJpaRepo extends JpaRepository<Student, Integer>{

	
} 


