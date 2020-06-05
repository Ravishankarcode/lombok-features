package com.example.lombok.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
/**
 * 
 * @author Ravishankar.kumar
 * @RequiredArgsConstructor generates a constructor with 1 parameter for each field that requires special handling.
 * 
 * @RequiredArgsConstructor(staticName = "of") same as below code
 *  public static ConstructorExample of(String description) {
 *  return new ConstructorExample(description);
 *  }
 */
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class ConstructorExample {

	private int x, y;
	@NonNull 
	private String description;
		
}
