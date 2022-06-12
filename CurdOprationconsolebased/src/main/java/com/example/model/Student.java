package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_table")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private int id;
	@Column
	private String name;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private final String country="INDIA";
	
	public Student( String name, String city, String state) {
		super();
		
		this.name = name;
		this.city = city;
		this.state = state;
		
	}
	
	
	

	public Student() {
		super();
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	

}
