package com.example.springdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity

public class DemoEntity {
@Id
private int id;
private String name;
private String age;
private String email;
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
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
