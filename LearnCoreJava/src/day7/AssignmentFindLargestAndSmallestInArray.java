package day7;

public class AssignmentFindLargestAndSmallestInArray {

	public static void main(String[] args) {
		int a[] = {21,22,45,67,88,80,12,10,14};
		int max=a[0];
		
		for(int x : a) {
			if(x>max) {
				max=x;
			}
		}
		System.out.println(max);

		
		int min = a[0];

		for (int x : a) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println(min);
	}

}
