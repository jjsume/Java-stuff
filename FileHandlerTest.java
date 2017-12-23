/**
 * 
 * @author jjsume
 * 
 * This is test class for FileHandler class;
 *
 */

import java.util.ArrayList;

public class FileHandlerTest { 
	
	public static void print(ArrayList<String> temp) {
		for (int x=0;x<temp.size();x++) {
			System.out.println((String) temp.get(x));
		}
	}
	
	public static void main(String[] args) {
		FileHandler fHandler = new FileHandler("in.txt", "out.txt");
		ArrayList<String> testList = new ArrayList<String>();
		//Let's read 'in.txt' -file content to fContent -list
		ArrayList<String> fContent = fHandler.readFile();
		//Let's add some text to 'testList'
		testList.add("Elvis Presley");
		testList.add("Janis Joplin");
		testList.add("Jimi Hendrix");
		
		//Printing fContent
		print(fContent);
		
		//Writing file
		fHandler.writeFile(testList);
		//
		
		/*Testing overridden toString() -method of the FileHandler -object
		 * 
		 * (fHandler-instance)
		 */
		System.out.println(fHandler);
	}
	
	
	
	
}
