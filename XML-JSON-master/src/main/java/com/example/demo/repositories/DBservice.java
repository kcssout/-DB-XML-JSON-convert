package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.xjdb;


public interface DBservice extends  JpaRepository<xjdb, Long>{

	Long countByX2j(String value);
	
	Long countByJ2x(String value);
	
	
}