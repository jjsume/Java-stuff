/** This library contains String-related methods to use in any program!
 * 
 * @auth Jere Sumell.
 * 
 * Date Created 01.06.2019
 */

import java.util.ArrayList;

public class StringLibrary {

	
	//Attributes
	private static StringBuffer sb = new StringBuffer();
	
	
	//Next method clears this Data Type's StringBuffer
	public static void clearBuffer() {
		//Clearing the StringBuffer, always call this method clearBuffer() first.
		sb.delete(0, sb.length());
	}
	
	//Next method reversed the given String as parameter returning Reversed String.
	
	public static String reverseString(String original) {
		clearBuffer();
		StringBuffer sbB = new StringBuffer("");
		for (int x=original.length()-1;x>=0;x--) {
			sbB.append(original.charAt(x));
		}
		return sbB.toString();
			
	}
	
	//Next method prints the ArrayList.
	public static void printList(ArrayList<String> list) {
		String next = null;
		for (int x=0;x<list.size();x++) {
			next = (String) list.get(x);
			System.out.println (next);
		}
	}	
	
}
	

