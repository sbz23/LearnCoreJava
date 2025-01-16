package coding_practice;

import java.util.List;

public class LargestDifferenceAdjacentArray {

	public static void main(String[] args) {
		int a[] = {1,4,8,15,17};
		int diff=0;
		for(int i= a.length-1;i>0;i--) {
			if(a[i] - (a[i-1])>diff)
			diff = a[i] - (a[i-1]);
				
		}
		System.out.println(diff);
		
		
		

	}

}
