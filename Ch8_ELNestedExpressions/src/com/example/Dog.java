package com.example;

public class Dog{
	private String name;
	private Toy[] toys;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setToys(Toy[] toys){
		this.toys = toys;
	}
	
	public Toy[] getToys(){
		return toys;
	}
}