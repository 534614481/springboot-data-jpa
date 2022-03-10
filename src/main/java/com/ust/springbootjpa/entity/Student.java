package com.ust.springbootjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Column(name="student_id")
	@Id
	private Integer id;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_age")
	private Integer studentAge;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String studentName, Integer studentAge) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
	
	
	
	

}
