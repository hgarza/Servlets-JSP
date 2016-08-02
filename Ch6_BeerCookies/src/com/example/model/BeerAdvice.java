package com.example.model;
import java.util.*;
public class BeerAdvice {
	public List<String> getBrands(String color, String body, String sizes) {
		List<String> brands = new ArrayList<String>();
		if (color.equals("amber") && body.equals("light")&& sizes.equals("12oz")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
			brands.add("Coronita");
			brands.add("Sol");
		} else if(color.equals("amber") && body.equals("medium")&& sizes.equals("16oz")){ 
			brands.add("Jack Amber big");
			brands.add("Red Moose big");
			brands.add("Coronita big");
			brands.add("Sol big");
			
		} else if(color.equals("brown") && body.equals("heavy") && sizes.equals("22oz")){ 
			brands.add("Jack Amber Familiar");
			brands.add("Red Moose Familiar");
			brands.add("Coronita Familiar");
			brands.add("Sol big Caguama");
		}else if (color.equals("brown") && body.equals("medium")) {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
			brands.add("Indio");
		} else {
			brands.add("Negra Modelo");
			brands.add("Bohemia");
			brands.add("Obispado Negra");
		}
		
		return(brands);
	}
}