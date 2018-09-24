/*
 * This class is for checking given word for palindrome or not.
 * 
 * Author Jere Sumell (jjsume@ Github-repository service)
 */

import java.util.*;

public class Palindrome {

	//Attributes
	private String[] word;
	private StringBuffer sb;
	private StringTokenizer st;
	private boolean isPalindrome;
	
	//Constructors
	public Palindrome() {
		this.word = new String[2];
		this.isPalindrome = false;
		this.sb = new StringBuffer("");
	}
	
	public Palindrome(String word) {
		this.word = new String[2];
		this.word[0] = word;	//First one is for the original word.
		this.sb = new StringBuffer("");
		this.st = new StringTokenizer(word);
		checkWord();
	}
	
	//Setters and getters

	public String[] getWord() {
		return word;
	}

	public void setWord(String org, String res) {
		this.word[0] = org;
		this.word[1] = res;
	}

	public boolean isPalindrome() {
		return isPalindrome;
	}

	public void setPalindrome(boolean isPalindrome) {
		this.isPalindrome = isPalindrome;
	}
	
	//Others methods
	public void checkWord() {
		createWord();
		if (word[0].equalsIgnoreCase(word[1])) {
			this.setPalindrome(true);
		}
	}
	
	//Next method checks if whitspaces is used.
	
	public void checkWhiteSpaces() {
		for (int x=0;x<word[0].length()-1;x++) {
			if (this.getWord()[0].charAt(x) == ' ') {
				this.st = new StringTokenizer(word[0]);
				createWord();
			}
			else {
				continue;
			}
		}
	}
	
	//If white spaces found, next one will create a new word without them
	public void createWord() {
		if (st.countTokens() >0) {
			while (st.hasMoreElements()) {
				sb.append(st.nextToken());
			}
			word[0] = sb.toString().toLowerCase();
		}
		else {
			word[0] = this.word[0].toLowerCase();
		}
		word[1] = reverseWord();
	}
	
	//Next method reverse the word;
	public String reverseWord() {
		sb.delete(0, sb.toString().length()); //Cleans buffer
		for (int x=word[0].length();x>0;x--) {
			sb.append(word[0].charAt(x-1));
		}
		return sb.toString().toLowerCase();
	}
	
	//Overriding toString()-method
	public String toString() {
		return "" + word[0] +" - " + word[1] + " - " +this.isPalindrome();
	}
	
}

