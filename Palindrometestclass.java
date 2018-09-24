/*
 * Palindrome or not - Test class for the Palindrome.java
 * 
 * Author Jere Sumell (jjsume @ Github
 * 
 * First commented lines are for not the UI use, but I programmed simple text-based UI down there
 * without comments.)
 * 
 * Check the picture for testing UI at Github-profile at the Java-Stuff -folder.
 */

import java.util.Scanner;
public class Palindrometestclass {

	private static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		//Without UI
		//Palindrome pal = new Palindrome("iNn o  S t Unut SO n ni");
		//System.out.println (pal);	//return "innostunutsonni - innostunutsonni - true".
		
		//With the text-based UI
		String input = "";
		do {
			System.out.println ("Enter your String to check. (Palindrome or not)");
			input = sc.nextLine();
			System.out.println (new Palindrome(input).toString());	//Checks whatever user input is.
		} while (!input.equalsIgnoreCase(""));
		
	}
	
}
