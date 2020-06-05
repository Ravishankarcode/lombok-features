package com.example.lombok.model;

import lombok.ToString;
/**
 * 
 * @author Ravishankar.kumar
 * By setting callSuper to true, you can include the output of the superclass implementation of toString to the output.
 */
@ToString(callSuper=true, includeFieldNames=true)
public class Square extends Shapes {

    private final int width, height;
    
    public Square(int width, int height) {
      this.width = width;
      this.height = height;
    }
}
