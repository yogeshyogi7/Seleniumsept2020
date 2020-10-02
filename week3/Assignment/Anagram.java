package week3.Assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1="stops";
		String str2="potss";
		
		boolean status=false;
		
		int length = str1.length();
		
		int length1 = str2.length();
		
		if(length==length1) {
			System.out.println("The length of both strings are same");
		}
		else {
			System.out.println("The length of both strings are not same");
		}
		
		char[] ch = str1.toCharArray();
		
		char[] ch1 = str2.toCharArray();
		
		Arrays.sort(ch);
		
		Arrays.sort(ch1);
		
		status=Arrays.equals(ch,ch1);
		
		System.out.println(status);	
		
		if(status)
		{
			System.out.println("The array values are same");
		}
		
		else {
			System.out.println("The array values are not same");
		}
		
		
	
	
	}
	
	}
		
		

