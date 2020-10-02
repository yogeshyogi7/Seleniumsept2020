package week3.Assignment;

public class FindTypes {

	public static void main(String[] args) {
		
		String str = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else {
				specialChar++;
			}
		}
		
		System.out.println("The String contains "+letter+" letters");
		System.out.println("The string contains "+num+ " number");
		System.out.println("The String contains "+space+ " spaces");
		System.out.println("The String conatins "+specialChar+ " specialcharacters");
			
		}

		
		
		
		
		


	}


