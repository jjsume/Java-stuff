import java.util.ArrayList;

public class BinarySearch {
	 
	//Attributes
	private ArrayList content;
	private ArrayList results;
	
	public BinarySearch(ArrayList cont, int key) {
		this.results = new ArrayList();
		this.content = cont;
		this.myBinarySearch(this.content, key);
		
	}
	
	public void myBinarySearch(ArrayList content, int key) {
	    int[] inputArr = modifyContent();
		
	        int start = 0;
	        int end = inputArr.length - 1;
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (key == inputArr[mid]) {
	            	
	            	results.add(new Integer(mid));
	            }
	            if (key < inputArr[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        }

	    }
	
	//Method for modifying the Content
	public int[] modifyContent() {
		Integer[] tempArr = new Integer[content.size()];
		for (int x=0;x<tempArr.length;x++) {
			tempArr[x] =(Integer)content.get(x);
		}
		return parseIntegertoIntArray(tempArr);
	}
	
	//Method for the Integer cast to int[]
	public int[] parseIntegertoIntArray(Integer[] ar) {
		int[] tempAr = new int[ar.length];
		for (int x=0;x<tempAr.length;x++) {
			tempAr[x] = ar[x].intValue();
		}
		return tempAr;
	}

	public ArrayList getResults() {
		return results;
	}

	public void setResults(ArrayList results) {
		this.results = results;
	}
	
	
}
