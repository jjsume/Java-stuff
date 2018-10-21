/**
 * 
 * @author jjsume (jjsume, Jere Sumell @github)
 *
 * This example gives the resolution for some Python coder at the Suomi24-Java forum,
 * who is asking if there's a way to restrict illegal formats at the results when
 * dividing two double-typed expressions. for ie. int -primary types.
 */

public class Koknaisluku {
	
	
	//At the next method return type is Object, String is retured in illegal case, 
	//(Dividing with the zero isn't possible.)
	public static Object divide (double x, double y) {
		if (y <= (double)0) {
			return new String("Can't divide with zero!");
		}
		double result = 0; 
			result = (double)x / (double) y;
			
		
		return new Double(result);	//Using Java Double-wrapper class. (equal to primary double type
	}
	
	//Overloading divide-method. Called in the case, where input parameters are int-primaries.
	public static Object divide(int x, int y) {
		return divide((double) x,(double) y); //casting from int -> double
		//Because divide (double,double) method returns Object, this kind of coding is legal move.);
		
	}
	

	public static void main(String[] args) {
		System.out.println(""+ divide(1,2));
		System.out.println("" +divide(2.33,3.0));
		System.out.println("" +divide(1,0));
	}
	
}
