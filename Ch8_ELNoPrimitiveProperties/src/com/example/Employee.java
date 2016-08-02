package com.example;

public class Employee extends Person {
	private int id;
	
	public Employee(){}	
	
	public void setId(int id){
		this.id = id;
	} 
	
	public int getId(){
		return id;
	}
}