/**
 * 
 * @author jjsume
 * 
 * This class can be used to check if the Finnish SSN is valid or not
 *
 */
import java.util.regex.*;
public class SSNValidationChecker {
	
	//Attributes
	
	private String ssn;
	private final String reqularExp = "^[0-9]{6}-(?:[0-9]+){1,3}[0-9A-Za-z]$"; 
	private boolean isValid;
	
	//Constructor
	
	public SSNValidationChecker(String ssn) {
		this.ssn = ssn;
		checkSSN();
		
	}

	//Setters and getters
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	//Other methods
	//Next method checks, if the given SSN is valid?
	
	public void checkSSN() {
		String temp = this.getSsn();
		//Next one set true or false through the setValid-method...
		this.setValid(Pattern.matches(this.reqularExp, this.getSsn()));
	}
	
	//Overriding toString();
	
	public String toString() {
		return "" + this.getSsn()+" is Valid? " +this.isValid();
	}
	
}
