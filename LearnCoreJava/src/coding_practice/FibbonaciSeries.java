package coding_practice;

public class FibbonaciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3=0;
		int count =10;
		
		System.out.print(n1+" "+n2);
		for(int	i=2;i<count;i++) {
			n3= n1+ n2; //1  //2 
			System.out.print(" "+n3);
			n1=n2; //1
			n2=n3; //1
		}

	}

}
