package com.example.lombok.model;

import lombok.NoArgsConstructor;
import lombok.NonNull;
/**
 * 
 * @author Ravishankar.kumar
 * @NoArgsConstructor will generate a constructor with no parameters. 
 */
@NoArgsConstructor
public class NoArgsExample {
	
	@NonNull 
	private String field;

}
