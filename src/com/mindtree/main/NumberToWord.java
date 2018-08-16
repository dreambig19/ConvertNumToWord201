/**
 * 
 */
package com.mindtree.main;

import java.util.logging.Logger;

import com.mindtree.service.Numbers;

/**
 * @author mramesh
 *
 */
public class NumberToWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length<1) {
			System.out.println("Atlease a single argument should be passed!!");
			return;
		}
		
		try {
			for (int i = 0; i < args.length; i++) {
				int number= Integer.parseInt(args[i]);
				System.out.println(args[i]+"- "+ Numbers.getNumberToWord(number));
			}
			System.out.println("Exiting");
		} catch (NumberFormatException e) {
			Logger.getAnonymousLogger("Invalid argument passed. Please verify the arguments!!");
		} catch (Exception e) {
			Logger.getAnonymousLogger("Invalid Number");
		}
	}

}

