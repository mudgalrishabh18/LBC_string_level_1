//WAP to accept a string and count number of Vowels present in it
package javastringlevel1_2;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			  char ch = s.charAt(i); 
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		 System.out.println("Vowels letters : " + count);
			sc.close();

	}

}
