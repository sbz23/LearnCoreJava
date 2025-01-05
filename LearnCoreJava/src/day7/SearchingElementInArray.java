package day7;

import java.util.Scanner;

public class SearchingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]= {21,23,2,4,29,31,18,10,71};
		System.out.println("Enter search number: ");
		int search_num=sc.nextInt();
		boolean status = false;
		for(int i=0;i<a.length;i++) {
			if(search_num==a[i]) {
				System.out.println("Element Found");
				status = true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element Not found");
		}

	}

}
