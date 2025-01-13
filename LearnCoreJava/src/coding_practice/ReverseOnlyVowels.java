package coding_practice;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		String input ="Shubham";
		String vowel = "aeiouAEIOU";
		
		char inputArray[] = input.toCharArray();
		int left =0;
		int right = input.length()-1;
		
		while(left<right) {
			
			if(vowel.indexOf(inputArray[left])==-1) {
				left++;
			}
			else if(vowel.indexOf(inputArray[right])==-1) {
				right--;
			}
			else {
				//swap
				char temp;
				temp = inputArray[left];
				inputArray[left] = inputArray[right];
				inputArray[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println("Output: "+ new String(inputArray));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*char inputArray[] = input.toCharArray();
		int i =0;
		int j = input.length()-1;
		while(i<j) {
			if(vowel.indexOf(inputArray[i])==-1) {
				i++;
			}
			else if(vowel.indexOf(inputArray[j])==-1) {
				j--;
			}
			else {
				//swap
				char temp = inputArray[i];
				inputArray[i]= inputArray[j];
				inputArray[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println("Output is: " +new String(inputArray)); */

	}

}
