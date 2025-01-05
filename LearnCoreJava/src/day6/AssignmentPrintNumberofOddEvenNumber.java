package day6;

public class AssignmentPrintNumberofOddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0,odd=0;	
		int a[]= {11,22,33,44,55,66};
		for(int x:a) {
			if(x%2==0) {
				even++;
			}
			else {
				odd++;
			}
					
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
