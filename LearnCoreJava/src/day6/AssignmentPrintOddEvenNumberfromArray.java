package day6;

public class AssignmentPrintOddEvenNumberfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//approch1
//		int a[]= {11,22,33,44,55,66};
//		for(int x:a) {
//			if(x%2==0) {
//				System.out.println(x+" is even number");
//			}
//			else {
//				System.out.println(x+" is odd number");
//			}
//			
//		}
		//approch 2
		int a[]= {11,22,33,44,55,66};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+"  is even number ");
			}
			else {
				System.out.println(a[i]+"  is odd number");
			}
		}
		
		

	}

}
