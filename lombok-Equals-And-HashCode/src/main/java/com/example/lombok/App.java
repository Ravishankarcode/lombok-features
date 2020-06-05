package com.example.lombok;

import com.example.lombok.model.Square;

import com.example.lombok.model.EqualsAndHashCodeExample;

/**
 * 
 * @author Ravishankar.kumar
 * Main Method for testing @EqualsAndHashCode example.
 */
public class App 
{
    public static void main( String[] args )
    {
        Square square = new Square(40, 50);
        System.out.println(square.hashCode());
        EqualsAndHashCodeExample example = new EqualsAndHashCodeExample(1, "Ravishankar");
        System.out.println(example.hashCode());
    }
}
