//WAP to accept the First name , Middle Name and Last Name of a person and display full name  and Short Name
package javastringlevel1_2;

import java.util.Scanner;

public class DisplayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		String f=sc.next();
		System.out.println("Enter middle name:");
		String m=sc.next();
		System.out.println("Enter last name:");
		String l=sc.next();
		System.out.println(f+" "+m+" "+l);
		System.out.println(f.charAt(0)+"."+m.charAt(0)+"."+l.charAt(0)+".");
	}

}
