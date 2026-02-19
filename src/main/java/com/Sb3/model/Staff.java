package com.Sb3.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Staff {
	
	@Id
	private int id;
	private String name;
	private String Dept;
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
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public Staff(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		Dept = dept;
	}
	public Staff() {
		super();
	}
	
	

}
