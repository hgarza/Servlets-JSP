package com.example;

public class Employee extends Person {
	private String id;
	
	public Employee(){}	
	
	public void setId(String id){
		this.id = id;
	} 
	
	public String getId(){
		return id;
	}
}