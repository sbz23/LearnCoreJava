package coding_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("D:\\Collection.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
