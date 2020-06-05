package com.example.lombok;

import lombok.extern.java.Log;
/**
 * 
 * @author Ravishankar.kumar
 * @Log same as 
 * private static final java.util.logging.Logger log 
 *  = java.util.logging.Logger.getLogger(UtilLogExample.class.getName());
 */
@Log
public class UtilLogExample {

	public static void main(String[] args) {
		 log.severe("Something's wrong here");
	}
}
