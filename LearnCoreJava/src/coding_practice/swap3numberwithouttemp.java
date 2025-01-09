package coding_practice;

public class swap3numberwithouttemp {
	public static void main(String[]args) {
	int a = 2;
	int b = 5;
	int c = 9;
	
	a = a+b+c;   //16
	b = a-(b+c); //2
	c= a-(b+c); //5
	a= a-(b+c); //9
	

}
	}
