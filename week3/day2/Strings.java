package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Strings {

	public static void main(String[] args) {
		
		List<String> values=new ArrayList<String>();
		

		values.add("naveen");
		values.add("shyam");
		values.add("raja");
		values.add("abhi");
		values.add("kavin");
		
		int count = values.size();
		System.out.println(count);
		
		System.out.println(values.get(3));
		
		List<String> newvalues=new ArrayList<String>(values);
		
		values.remove(2);
		
		newvalues.remove(4);
		
		
		for (String eachvalue : newvalues) {
			
			System.out.println(eachvalue);
			
		}
		
	}
	

}
