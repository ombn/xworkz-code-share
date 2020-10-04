package com.xworkz.airport.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "airhostes")
public class AirHostessDTO implements Serializable {
	@Column(name = "A_ID")
	private int id;
	
	@Column(name = "A_NAME")
	private String name;
	@Column(name = "A_AGE")
	private int age;
	
	@Column(name = "A_HOBBIES")
	private String hobbie;
	@Column(name = "A_HEIGHT")
	private double height;

	public AirHostessDTO() {
		System.out.println("Created \t " + this.getClass().getSimpleName());
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "AirHostessDTO [name=" + name + ", age=" + age + ", id=" + id + ", hobbie=" + hobbie + ", height="
				+ height + "]";
	}

}
