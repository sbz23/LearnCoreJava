package day19;
//Exception is parent class of all exception classes
import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("Program is started.......");
		Scanner sc = new Scanner(System.in);
		
		String s=null;  //NullPointerException
		try {
		System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithemetic exception handled...");
		}
		
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception exception handled...");
		}
		
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception exception handled...");
		}
		
		System.out.println("Program is completed.......");

	}

}
