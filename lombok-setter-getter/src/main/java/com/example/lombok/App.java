package com.example.lombok;

import com.example.lombok.model.GetterSetterExample;

/**
 * 
 * @author Ravishankar.kumar
 * Main Method for testing Getter and Setter example.
 */
public class App 
{
    public static void main( String[] args )
    {
        GetterSetterExample example = new GetterSetterExample();
        System.out.println("Before Setting Age is ::"+example.getAge());
        example.setAge(35);
        System.out.println("After Setting Age is::"+ example.getAge());
    }
}
