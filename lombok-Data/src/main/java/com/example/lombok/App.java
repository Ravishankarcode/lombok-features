package com.example.lombok;

import com.example.lombok.model.DataExample;

/**
 * 
 * @author Ravishankar.kumar
 * Main Method for testing @Data example.
 */
public class App 
{
    public static void main( String[] args )
    {

    	DataExample getterSetter = new DataExample();   	
    	getterSetter.setScore(30);
    	System.out.println(getterSetter.getScore());
    	//we can't set age because accessible level within the package only.
    	System.out.println(getterSetter.getAge());
    	//we can't set final field but we can get final field.
    	System.out.println(getterSetter.getName());
    	//getting hash code value
    	System.out.println(getterSetter.hashCode());
        System.out.println(getterSetter.toString());
    }
}
