package day6;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration
		//approch1
		/*int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[2][1]=400;*/
		
		//approch2
		int a[][]= {
				{100,200},
				{200,300},
				{400,500}
				};
		
		//find size of an array
//		System.out.println(a.length);//number of rows
//		System.out.println(a[0].length); //returns number of column in specific row
//		
		//read single value from array
//		System.out.println(a[1][1]);
		
		//read data from 2D array
//		for(int i=0;i<=2;i++) {
//			for(int j=0;j<=1;j++) {
//				System.out.print(a[i][j]+"  ");
//			}
//			System.out.println();
//			
//		}
		
		//enhanced for loop
		for(int arr[]:a) {
			for(int x:arr) {
				System.out.println(x);
			}
		}
		
		

	}

}
