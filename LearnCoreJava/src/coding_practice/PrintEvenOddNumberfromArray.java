package coding_practice;

public class PrintEvenOddNumberfromArray {

	public static void main(String[] args) {
		int arr[] = {56,11,89,80,56,41,22};
		
		System.out.println("Even numbers: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			
		}
		System.out.println("Odd numbers: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
			
		}
		

	}

}
