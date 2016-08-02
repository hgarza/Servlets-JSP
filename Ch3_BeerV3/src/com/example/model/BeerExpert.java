package com.example.model;
import java.util.*;

public class BeerExpert {
	public List getBrands(String color, String body) {
		List brands = new ArrayList();
		if (color.equals("amber") && body.equals("light")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
			brands.add("Coronita");
			brands.add("Sol");
		} else if (color.equals("brown") && body.equals("medium")) {
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