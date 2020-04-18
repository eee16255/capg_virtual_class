package com.capg.lab2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.lab2.demo.models.Trainee;

public interface TraineeDaoInterface extends JpaRepository<Trainee,Integer> {

}
