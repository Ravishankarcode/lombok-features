package com.example.lombok.model;

import lombok.EqualsAndHashCode;
/**
 * 
 * @author Ravishankar.kumar
 * @EqualsAndHashCode to let lombok generate implementations of the equals(Object other) and hashCode() methods.
 */
@EqualsAndHashCode
public class EqualsAndHashCodeExample {
	/**
	 * By default, it'll use all non-static, non-transient fields, 
	 * but you can modify which fields are used (and even specify that the output of various methods is to be used) 
	 * by marking type members with 
	 * @EqualsAndHashCode.Include or 
	 * @EqualsAndHashCode.Exclude.
	 */
	@EqualsAndHashCode.Exclude 
	private int id;
	private String name;
	  
	public EqualsAndHashCodeExample(int id, String name) {

		this.id = id;
		this.name = name;
	}	    	  

}
