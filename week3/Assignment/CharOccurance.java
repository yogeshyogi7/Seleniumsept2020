package week3.Assignment;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		
		char[] charArray = str.toCharArray();
		
		int length = charArray.length;
		
		int count=0;
		
		char ch='e';
		
		for (int i = 0; i <length; i++) {
			
			if(charArray[i]==ch) {
				
				count++;
			}
		}
			
		System.out.println("The number of count is "+count);
			
			
			
		}
	}

		
		

	


