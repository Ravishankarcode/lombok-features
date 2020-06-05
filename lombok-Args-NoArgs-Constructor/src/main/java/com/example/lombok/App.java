package com.example.lombok;

import com.example.lombok.model.ConstructorExample;
import com.example.lombok.model.NoArgsExample;

/**
 * 
 * @author Ravishankar.kumar
 * Main Method for testing @RequiredArgsConstructor example.
 */
public class App 
{
    public static void main( String[] args )
    {
        // NO Arguments Constructors 
    	NoArgsExample noargs = new NoArgsExample();
    	// Arguments Constructors
    	ConstructorExample argsconst = new ConstructorExample(5, 10, "Description");
    	
    	System.out.println(argsconst.toString());
    }
}
