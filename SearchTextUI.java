import java.util.ArrayList;
import java.util.Random;

public class SearchTextUI {

	public static void main(String[] args) {
		ArrayList temp = new ArrayList();
		Random r = new Random();
		for (int x=0;x<1000;x++) {
			temp.add(new Integer(r.nextInt(5)));	
	}
	BinarySearch bS = new BinarySearch(temp, 4);
	ArrayList tempB = bS.getResults();
	for (int y=1;y<tempB.size()-1;y++) {
		System.out.println(tempB.get(1));
	}
	
	}
	
}
