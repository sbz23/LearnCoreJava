package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		//identified by complier
		System.out.println("program started");
		System.out.println("program inprogress");
		FileInputStream file = new FileInputStream("D:\\file.txt");
		
	//using throws keyword we handle checked exceptions
		
		
		
		System.out.println("program completed");

	}

}
