package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class xjdb {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String x2j;	
	private String j2x;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getX2j() {
		return x2j;
	}

	public void setX2j(String x2j) {
		this.x2j = x2j;
	}

	public String getJ2x() {
		return j2x;
	}

	public void setJ2x(String j2x) {
		this.j2x = j2x;
	}



}
