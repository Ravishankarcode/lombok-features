package com.example.lombok.model;

import lombok.ToString;
/**
 * 
 * @author Ravishankar.kumar
 * By default, it'll print your class name, along with each field, in order, separated by commas.
 */
@ToString
public class ToStringExample {
	/**
	 * By default, all non-static fields will be printed. 
	 * If you want to skip some fields, you can annotate these fields with 
	 * @ToString.Exclude
	 */
	@ToString.Exclude 
	private int id;
	private String name;
	  
	public ToStringExample(int id, String name) {

		this.id = id;
		this.name = name;
	}	    	  

}
