package day7;

public class AssignmentMissingNumberinArray {

	public static void main(String[] args) {
		int a[] = {1,2,4,5};
		
		int sum1=0;
		for(int x : a) {
			sum1=sum1+x;
		}
		int sum2=0;
		for(int i=0;i<=5;i++) {
			sum2=sum2+i;
		}
		
		int missingnumber= sum2-sum1;
		System.out.println(missingnumber);

	}

}
