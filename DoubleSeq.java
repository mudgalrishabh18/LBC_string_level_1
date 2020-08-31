package javastringlevel1_2;

import java.util.Scanner;

public class DoubleSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter any string- ");
		String s=sc.nextLine();
	//	String s="Big black bug bit a big black dog on his big black nose"; 
		int count;
		s=s.toLowerCase();
		String words[]=s.split(" ");
	    System.out.println("Duplicate words in a given string : ");  
	
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j] = "0"; //important part
				}
		}
		 if(count > 1 && words[i] != "0") {
			   System.out.println(words[i]);
		   }
               
		
		}
	}

}
