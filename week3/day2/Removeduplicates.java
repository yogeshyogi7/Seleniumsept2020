package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Removeduplicates {
	
	

	public static void main(String[] args) {
		
		String[] companies= {"TCS","Wipro","Infosys","FIS","TCS","Wipro"};
		
		Set<String> values=new LinkedHashSet<String>();
		
		for (String eachdata : companies) {
			
			values.add(eachdata);
			
		}
		
		System.out.println(values);
		
		for (String eachvalue : values) {
			
			System.out.println(eachvalue);
			
		}
			
		}
		
		
	}


