package com.shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop")
public class Shop {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private String name;
 private int rent;
 private String doorNo;
 private int noOfEmployee;
 
 
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
public int getRent() {
	return rent;
}
public void setRent(int rent) {
	this.rent = rent;
}
public String getDoorNo() {
	return doorNo;
}
public void setDoorNo(String doorNo) {
	this.doorNo = doorNo;
}
public int getNoOfEmployee() {
	return noOfEmployee;
}
public void setNoOfEmployee(int noOfEmployee) {
	this.noOfEmployee = noOfEmployee;
}
   
   
}
