package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Certificate")
public class Certificate {
	
	@Id
	@Column(name="Cert_Id")
	private int cert_id;
	private int year;
	
	@ManyToOne(cascade=CascadeType.ALL) 
	@JoinColumn(name="clg_Id")
	private College college;
	
	@OneToOne(mappedBy="certificate")
	private Student student;

	
	
	//getters and setters method


	public int getCert_id() {
		return cert_id;
	}

	public void setCert_id(int cert_id) {
		this.cert_id = cert_id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	

	
	

}


