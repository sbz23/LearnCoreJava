package day4;

public class AssignmentSmallestofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=129,b=102,c=989;
		if(a<b && a<c) {
			System.out.println("A is smallest number");
		}
		else if(b<a && b<c) {
			System.out.println("B is smallest number");
		}
		else if(c<a && c<b) {
			System.out.println("C is smallest number");
		}

	}

}
