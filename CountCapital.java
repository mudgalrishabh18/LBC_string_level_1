//WAP to accept a String and Count number of Capital letters present in it.
package javastringlevel1_2;

import java.util.Scanner;

public class CountCapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:");
		String s=sc.nextLine();
		int flag=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				flag=flag+1;
			}
			
		}System.out.println(flag);

	}

}
