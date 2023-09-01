package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Userentity {
	@Id
	private int id;
	private String name;
	private int age;
	private int phoneno;
	private String emailid;
	public Userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userentity(int id, String name, int age, int phoneno, String emailid) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		this.emailid = emailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
}
	
	
	
	
	