package day6;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////Declaring Array
		
		//Approch1
		/*
		 * int a[]=new int[5]; a[0]=10; a[1]=20; a[2]=30; a[3]=40; a[4]=50;
		 */
		
		//Approch2
		int a[]= {10,20,30,40,50};
		
		
		//find size of array
		System.out.println(a.length); //returns length or size of array
		
		//read single value from array
		System.out.println(a[2]);
		System.out.println(a[0]);
		
		
		//read multiple value from array
		//1.System.out.println(Arrays.toString(a));
		//2.normal for loop
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
		
		
		//3 enhanced for loop/for each loop
		for(int x:a) {
			System.out.println(x);
		}
		
		
	}

}
