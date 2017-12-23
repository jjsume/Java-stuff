/**
 * 
 * @author jjsume
 * 
 * Class for handling Files and Strings.
 * 
 * Writing Strings or reading strings to ArrayList<String>();
 *
 */

import java.io.*;
import java.util.ArrayList;

public class FileHandler {
	
	//Attributes
	private File inTiedosto;
	private File outTiedosto;
	private FileReader fRead;
	private FileWriter fWrite;
	private BufferedReader bfReader;
	private BufferedWriter bfWriter;
	
	//Constructor
	
	public FileHandler(String inFileName, String outFileName) {
		this.inTiedosto = new File(inFileName);
		this.outTiedosto = new File(outFileName);
		try {
			this.fRead = new FileReader(inTiedosto);
			this.fWrite = new FileWriter(outTiedosto);
		} catch (Exception e) {
			System.out.println ("Error in opening file Stream!");
		}
		//Let's init Buffers
		this.bfReader = new BufferedReader(this.fRead);
		this.bfWriter = new BufferedWriter(this.fWrite);
		
		
	}
	
	//Setters and Getters
	
	public File getInTiedosto() {
		return inTiedosto;
	}

	public void setInTiedosto(File inTiedosto) {
		this.inTiedosto = inTiedosto;
	}

	public File getOutTiedosto() {
		return outTiedosto;
	}

	public void setOutTiedosto(File outTiedosto) {
		this.outTiedosto = outTiedosto;
	}
	
	//Other Methods
	
	//Reads strings from txt-file to ArrayList
	public ArrayList<String> readFile() {
		//Let's create temp ArrayList.
		ArrayList<String> temp = new ArrayList<String>();
		try {
			String tempString = bfReader.readLine();
		
				//Reader.read() return -1 when EOF;
				while (bfReader.read() >= 0) {
					temp.add(tempString);
					tempString = (String) bfReader.readLine();
				}
			
		} catch (Exception e) {
			System.out.println ("Input/Output error");
			
		}
		System.out.println ("File:" +this.getInTiedosto().getName() +" read succesfully!");
	return temp;
	}
	

	//Writes given ArrayList to a File
	public void writeFile(ArrayList<String> temp) {

		for (int x=0;x<temp.size();x++) {
			try{
				//Flushing the input -buffer first.
				bfWriter.flush();
				
				String str = (String) temp.get(x);
				//Writing the str
				bfWriter.write(str +"\n");
				
				} catch (Exception e) {
				System.out.println ("Input/Output error");
				}
		}
		//Closing the stream;
		try {
			bfWriter.close();
		} catch (Exception e) {
			System.out.println ("Error in closing stream!");
		}
	
	
		System.out.println("File writing done! ("+this.getOutTiedosto().getName() +")");
	}
	
	//Overriding toString();
	
	public String toString() {
		return "Input file: " +this.getInTiedosto().getName() +"\nOutput file: " +this.getOutTiedosto().getName();
	}
	
}
