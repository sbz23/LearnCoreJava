package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Welcome";
		//String s = new String("Welcome");
		System.out.println(s);

		//length() -- returns length of string
		int l=s.length();
		System.out.println(l);
		System.out.println(s.length());
		
		//concat()  +
		String s1 ="Welcome";
		String s2 =" to java";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		//trim()  remove spaces in right and left side
		s="   Welcome   ";
		System.out.println("Before Triming: "+s.length());
		s1=s.trim();
		System.out.println("After Triming: "+s1.length());
		
		//charAt()  returns character based on index
		String w = "paco";
		System.out.println(w.charAt(0));
		System.out.println(w.charAt(2));
		
		
		//contains()  - returns true/false
		//check string is part of main string
		System.out.println(s.contains("Wel"));
		//values are case sensitive
		System.out.println(s.contains("welome"));
		
		//equals(), equalsIgnoreCase()   - compare 2 strings
		//returns boolean
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("welcome"));
		
		
		//replace
		String u="Welcome to python selenium";
		System.out.println(u.replace('e', 'x'));
		System.out.println(u.replace("python", "java"));
		
		
		//substring -- extract substring from main string
		//starting index starts from 0 and ending index starts from 1
		String m = "welcome";
		System.out.println(m.substring(2,5));
		System.out.println(m.substring(1,3));
		
		
		//toUpperCase   toLowerCase()
		
		//split --> divide/split the string into multiple parts based on delimeter.
		//ex1
		String d="abc@xyz";
		String a[]=d.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//ex2
		d="shubham@gmail.com";
		String d1[]=d.split("@");
		System.out.println(d1[0]);
		
		//ex3 -- replace()
		String amount = "$15,20,55";
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		//ex4
		String str="abc,123@xyz";
		String st[]=str.split("@");
		System.out.println(st[0]);
		System.out.println(st[1]);  //xyz
		String st1[]=st[0].split(",");
		System.out.println(st1[0]);//abc
		System.out.println(st1[1]);//123
		
		//optimize ex4
		String firstString=str.split("@")[1];//xyz
		String secondString = str.split(",")[0];//abc
		String thirdString =str.split(",")[1].split("@")[0];//123
		
		System.out.println(firstString);
		System.out.println(secondString);
		System.out.println(thirdString);
		
	   // * % ^ & ( ) cannot be used as delimeters
		//problem
		
		String name = "John Kennedy";
		System.out.println(name.contains("john"));
		
		System.out.println(name.toLowerCase().contains("john"));
		
		//object type of array  -->not recommended ArrayList is recommended
		Object z[]=new Object[4];
		z[0]="Shubham";
		z[1]= 1.88;
		z[2]=2;
		z[3]=true;
		System.out.println(Arrays.toString(z));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
