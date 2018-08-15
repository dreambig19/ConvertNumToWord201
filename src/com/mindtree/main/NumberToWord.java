/**
 * 
 */
package com.mindtree.main;

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
			System.out.println("polling");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.err.println("Invalid argument passed. Please verify the arguments!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error while converting number to word!!");
		}
	}

}
