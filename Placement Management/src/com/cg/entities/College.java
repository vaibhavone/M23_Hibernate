package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="College")
public class College {
	
	@Id
	@Column(name="clg_Id")
	private int clg_Id;
	private String collegeName ;
	private String location;
	
	
	@OneToOne(mappedBy="College")
	private User user;


	//getters and setters method
 
	public int getClg_Id() {
		return clg_Id;
	}


	public void setClg_Id(int clg_Id) {
		this.clg_Id = clg_Id;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	
	
}


