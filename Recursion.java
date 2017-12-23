/**
 * 
 * @auth jjsume
 * 
 * Recursion -example works in the following way:
 * 
 * Search first appearance of the biggest value of the Prime number given 
 * as String, removes it, rebuild new string, and multpiles new value with the
 * biggest number of the last String.
 * 
 * This one is dedicated some Java-programmer at Suomi24 -Java Forum, who asked the answer.
 * 
 * The Keyword is the Recursion. 
 * (Hanoi Towers is good classic recursive problem used in educational materials widely.);
 */

import java.lang.StringBuffer;

public class Recursion {
	
	//Attributes
	private static StringBuffer sb = new StringBuffer("");
	private static StringBuffer value = new StringBuffer("");
	
	//Compares to int -value and returns boolean type.
	public static boolean compare(int x, int y) {
		if (x > y) {
			return false;
		}
		return true;
	}
	
	//Rebuilds new String -object without biggest value of the last string.
	public static String reBuild(char[] array, int index) {
		sb.delete(0, sb.length());	//Formatting Buffer;
		for (int x=0;x<array.length;x++) {
			if (x==index) {
				continue;
			}
			else {
				sb.append(array[x]);
			}
		}
		return sb.toString();
	}
	
	//Simple charArray -> toSTring
	public static String makeString(char[] prime) {
		value.delete(0, value.length());
		for (int x=0;x<prime.length;x++) {
			value.append(Integer.parseInt(Character.toString(prime[x])));
		}
		return value.toString();
	}

	// Next method uses recursive return call, if there more numbers than 1.. 
	public static int multipleWithBiggest(char[] temp,String original) {
		String returnThis = original;			
		while (!original.equalsIgnoreCase("")) {
			int max = Integer.parseInt(Character.toString(temp[0]));
			int index = 0;
			

			for (int x = 1;x<temp.length;x++) {
				if (compare(max,Integer.parseInt(Character.toString(temp[x])))) {
					max = Integer.parseInt(Character.toString(temp[x]));
					index = x;
				}
				else {
					continue;
				}
			}
			/*Next one you can use for check values:
			 * 
			 * System.out.println ("Old Prime: " +original +"\t" +"Biggest value: " +max +"\t" +"New Value: " +reBuild(temp,index) +"\t" +"Multipler: " +max);
			 */
			
			Integer newValue = Integer.parseInt(reBuild(temp,index));
			int multipler = Integer.parseInt(Character.toString(temp[index]));
			char[] newValueChars = newValue.toString().toCharArray();
			String newString = makeString(newValueChars);
			Integer newValueB = Integer.parseInt(newString)*multipler;
			System.out.println(newValueB);
			returnThis = newValueB.toString();
			if (returnThis.length() >=2) {
				return multipleWithBiggest(returnThis.toCharArray(), newString); 
			}
			
		
			else {
				break;
			}
		}
		return 0;

	}

	//Main class of the Program.
	public static void main(String[] args) {
		
		String prime = "4752";
		char[] numbers = prime.toCharArray();
		System.out.println(prime);
		multipleWithBiggest(numbers, prime);
		
	}
}
