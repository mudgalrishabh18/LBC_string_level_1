package javastringlevel1_2;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="15 August is Independence Day";
		//String s1=s.replaceAll("15 August", "26 January");
		String s1=s.replace("15 August", "26 January");
		String s2=s1.replace("Independence","Republic");
		System.out.println(s2);

	}

}
