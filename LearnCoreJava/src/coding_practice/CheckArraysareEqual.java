package coding_practice;

public class CheckArraysareEqual {

	public static void main(String[] args) {
		
		int arr1[] = {3,21,2};
		int arr2[] = {3,21,2};
		boolean status = true;
		
		if(arr1.length == arr2.length) {
			
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!= arr2[i]) {
					status = false;
				}
			}
			
		}
		else {
			
			status = false;
		}
		
		if(status =true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		

	}

}
