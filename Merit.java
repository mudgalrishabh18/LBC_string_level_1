package javastringlevel1_2;

import java.util.Scanner;

public class Merit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[5];
		String name[]=new String[5];
		System.out.println("enter name and marks of individual 5 students  ");
		for(int i=0;i<5;i++) {
			name[i]=sc.next();
			marks[i]=sc.nextInt();
		
			}
	
		
		for(int i=0;i<marks.length;i++) {
			for(int j=1;j<marks.length;j++) {
				if(marks[j-1]<marks[j]) {
					int temp=marks[j-1];
					marks[j-1]=marks[j];
					marks[j]=temp;
				}
			}
		}
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		

	}

}
