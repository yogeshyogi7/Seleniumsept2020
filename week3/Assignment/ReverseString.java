package week3.Assignment;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "feeling good";
		
		char[] charArray = str.toCharArray();
		
		for (int i = charArray.length-1; i >=0; i--) {
			
			System.out.print(charArray[i]);
			
		}
		
		}
}


