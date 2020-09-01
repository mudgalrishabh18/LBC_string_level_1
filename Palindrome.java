package javastringlevel1_2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:");
		String s1=sc.nextLine();
		System.out.println("Enter another string:");
		String s2=sc.nextLine();
		  for(int i = s2.length()-1; i >= 0; i--)
		  {
	            s3 = s3 + s2.charAt(i);
	        }
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}

	}

}
