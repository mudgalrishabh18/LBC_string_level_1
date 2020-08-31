package javastringlevel1_2;

public class DictionaryOrder {

	public static void main(String[] args) {
		String[] words= {"rishabh","rahul","rajesh","ramu"};
		for(int i=0;i<4;i++) {
			for(int j=i;j<4;j++) {
				if(words[i].compareTo(words[j])>0) {
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(words[i]);
		}

	}

}
