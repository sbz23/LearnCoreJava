package day6;

public class AssignmentFindSumofElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//approch1 -> using for each loop
//			int a[]= {10,20,30,40,60};
//			int sum =0;
//			for(int x : a) {
//				sum +=x ;
//			}
//			System.out.println(sum);
		//approch2 using for loop
		int a[] = {10,20,20,40,60};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		

	}

}