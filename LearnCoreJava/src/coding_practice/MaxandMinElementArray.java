package coding_practice;

public class MaxandMinElementArray {

	public static void main(String[] args) {
		int arr[] = {44,4,56,66,11,23,2,46,9};
		int max =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max element in array is: "+max);
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min element in array is: "+min);

	}

}
