package javastringlevel1_2;

import java.util.Scanner;

public class CompareWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string- ");
		String s1=sc.nextLine();
		System.out.print("Enter any string- ");
		String s2=sc.nextLine();
		if(s1.equals(s2)) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}

	}

}
