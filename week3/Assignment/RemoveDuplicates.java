package week3.Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "We learn java basics as part of java sessions in java week1";
		
		String[] split = str.split(" ");
		
		Set<String> duplicate=new LinkedHashSet<String>();
		
		for (String eachword : split) {
			
			duplicate.add(eachword);
			
		}	
		
		System.out.println(duplicate);
		
		for (String eachvalue : duplicate) {
			
			System.out.print(" "+eachvalue);
			
		} 
		
		
		

	}

}
