package com.example;


public class Tip {
	String[] Tips = {"<h1></h1> tags for the main header of your webpage", "<b></b> tags make things bold", "<a></a> tags for hyperlink", "<em></em> tags for emphasized text"};	
	String currentTip = "Hola";
	
	public String getCurrentTip(){
		int index = (int) Math.round(Math.random()*3);
		currentTip = Tips[index];
		return currentTip;
	}

	
}
