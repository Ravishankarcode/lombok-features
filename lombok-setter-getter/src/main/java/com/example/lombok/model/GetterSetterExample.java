package com.example.lombok.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


/**
 * 
 * @author Ravishankar.kumar
 * If you want to generate default setter/getter method automatically in all field's.
 * Apply below annotation above the class
 * @Getter
 * @Setter
 * 
 */
public class GetterSetterExample {
	/**
	 * If you want to generate default public setter and getter method.
	 */
	@Getter 
	@Setter 
	private int age = 10;
	/**
	 * If you want to generate default protected setter method.
	 */
	@Setter(AccessLevel.PROTECTED) 
	private String name;

}
