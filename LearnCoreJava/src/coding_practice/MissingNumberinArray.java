package coding_practice;

public class MissingNumberinArray {

	public static void main(String[] args) {
		//array should not have any duplicates
		//number should be in proper range
		int arr1[] = {1,2,4,5};
		int sum1 =0;
		for(int i = 0; i<arr1.length;i++) {
			sum1=sum1+arr1[i];
		}
		int sum2=0;
		for(int i=1;i<=5;i++) {
			sum2=sum2+i;
		}
		
		int missingEle=sum2-sum1;
		System.out.println(missingEle);

	}

}
