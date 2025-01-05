package day19;

public class ThrowKeyword {
	//throw keyword is used to create our own exception
	
	void checksum(int num) {
		if(num<1) {
			throw new ArithmeticException("Number is negative cannot calculate sqauare");
		}
		else {
			System.out.println(num*num);
		}
	}

	public static void main(String[] args) {
		
		ThrowKeyword tk = new ThrowKeyword();
		try {
		tk.checksum(-4);
		}
		catch(Exception e) {
			System.out.println("Data is not valid");
		}
	}

}
