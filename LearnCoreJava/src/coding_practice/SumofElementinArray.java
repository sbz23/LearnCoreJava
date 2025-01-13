package coding_practice;

public class SumofElementinArray {

	public static void main(String[] args) {
		
		int a[] = {23,434,43,2,4,5,88,90};
		int sum =0;
		
		/*for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);*/
		
		for(int x : a) {
			sum = sum + x;
		}
		System.out.println(sum);
		

	}

}
