package com.example.lombok.model;

import lombok.EqualsAndHashCode;
/**
 * 
 * @author Ravishankar.kumar
 * By setting callSuper to true, you can include the equals and hashCode methods of your superclass in the generated methods.
 */
@EqualsAndHashCode(callSuper=true)
public class Square extends Shapes {

    private final int width, height;
    
    public Square(int width, int height) {
      this.width = width;
      this.height = height;
    }
}
