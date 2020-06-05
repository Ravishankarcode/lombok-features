package com.example.lombok;

import com.example.lombok.model.Square;
import com.example.lombok.model.ToStringExample;

/**
 * 
 * @author Ravishankar.kumar
 * Main Method for testing @ToString example.
 */
public class App 
{
    public static void main( String[] args )
    {
        Square square = new Square(40, 50);
        System.out.println(square.toString());
        ToStringExample example = new ToStringExample(1, "Ravishankar");
        System.out.println(example.toString());
    }
}
