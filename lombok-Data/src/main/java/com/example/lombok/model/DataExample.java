package com.example.lombok.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
/**
 * 
 * @author Ravishankar.kumar
 * All together now: A shortcut for @ToString, @EqualsAndHashCode,
 * @Getter on all fields, @Setter on all non-final fields, and @RequiredArgsConstructor!
 */
@Data
public class DataExample {
	
	  private final String name = "Ravishankar";
	  // we can set age within the same package only. 
	  @Setter(AccessLevel.PACKAGE) 
	  private int age;
	  private double score;
	  private String[] tags;

}
