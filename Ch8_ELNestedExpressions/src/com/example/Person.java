package com.example;

public class Person {
	private Dog dog;
	private String name;
	
	public Person(){}	
	
	public void setDog(Dog dog){
		this.dog = dog;
	}
	
	public Dog getDog(){
		return dog;
		
	}
	public void setName(String name){
		this.name = name;
	} 
	
	public String getName(){
		return name;
	}
}