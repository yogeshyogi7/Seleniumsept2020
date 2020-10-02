package week3.Assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		
		String str = "Tes12Le79af65";
		
		int sum=0;
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(Character.isDigit(ch[i]))
			{
				sum=sum+Character.getNumericValue(ch[i]);
			}
		}
		
		System.out.println(sum);
		}
		
		
		

	}


