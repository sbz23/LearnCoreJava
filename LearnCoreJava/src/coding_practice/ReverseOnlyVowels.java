package coding_practice;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		String input ="Shubham";
		//output = "Holle";
		String vowel = "aeiouAEIO";
		char inputArray[] = input.toCharArray();
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
		System.out.println("Output is: " +new String(inputArray));

	}

}
