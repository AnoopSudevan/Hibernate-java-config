package com.niit.Hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int ID;
String dept;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
}
