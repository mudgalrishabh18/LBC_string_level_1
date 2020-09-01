package javastringlevel1_2;

import java.util.Scanner;

public class Wonders {
	   public static void main(String[] args) {  

		   Scanner sc = new Scanner(System.in);

		   String[] w = { "CHICHEN ITZA", "CHRIST THE RDEEEMER", "TAJMAHAL",  "GREAT WALL OF CHINA",  "MACHU PICCHU", "PETRA", "COLOSSEUM" };

		   String[] l = { "MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY" };

		    System.out.print("Enter name of the country: ");

		    String ch = sc.next();

		    int count=0;

		    for (int i = 0; i < l.length; i++) {

		     if (l[i].equals(ch)) {

		count= i;

		   }

		}

		if (count!= 0) {

		System.out.println(l[count] + " - " + w[count]);

		}  

		else {

		System.out.println("Sorry Not Found!");

		}

		}

		}

