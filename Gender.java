package javastringlevel1_2;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any full name- ");
		String s1=sc.nextLine();
	//	StringBuffer newStr=new StringBuffer(s1); 
		if(s1.contains("mr")||s1.contains("Mr")) {
			System.out.println("Male");
		}else if(s1.contains("mrs")) {
			System.out.println("Female");
		}else {
			System.out.println("Other");
		}
	
		

	}

}
