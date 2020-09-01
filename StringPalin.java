package javastringlevel1_2;

import java.util.Scanner;

public class StringPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3="";
		int count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string :");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String words[]=s.split(" ");
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				s3 = s3 + words[j];
				count++;
			}
		}
	
	for(int i=0;i<words.length;i++) {
		if(count>1&&words[i].equals(s3)) {
			System.out.println(words[i]);
		}else {
			System.out.println("NOT p");
		}
		
	}
		
		
	}

}
