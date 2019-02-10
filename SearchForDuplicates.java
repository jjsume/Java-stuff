
public class SearchForDuplicates {

	
	public static void main(String[] args) {
		int[] temp = {1,4,6,5,3,6,8,9,6};
		for (int x=0;x<temp.length;x++) {
			if (temp[x] ==6 ){ //Looking for the magic number '6';
				System.out.println("["+x+"]"+" ->" +temp[x]);
				continue; //Continuing foward to search for Duplicate sixes.
			}
		}
	}
	
	
	
}
