package coding_practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int num= 22;
		boolean isPrime =true;
		//prime number is number which is divisible by itself and 1
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				isPrime =false;
				break;
			}
			
			
			}
		if(isPrime) {
		System.out.println("The number is prime number");
		}else {
			System.out.println("The number is not prime number");
		}
		
		}

	}


