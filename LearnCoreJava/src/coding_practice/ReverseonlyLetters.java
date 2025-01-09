package coding_practice;

public class ReverseonlyLetters {

	public static void main(String[] args) {
		String input = "123shubham";
		//output should be :123mahbuhs
		int left =0;
		int right = input.length()-1;
		
		char inputArray[] = input.toCharArray();
		
		while(left<right) {
			if(!Character.isLetter(inputArray[left])) {
				left++;
			}
			else if(!Character.isLetter(inputArray[right])) {
				right--;
			}
			else {
				//swap
				char temp;
				temp = inputArray[left];
				inputArray[left] = inputArray[right];
				inputArray[right]= temp;
				left++;
				right--;
			}
		}
		System.out.println("Output is :" +new String(inputArray));
		
	}
}

