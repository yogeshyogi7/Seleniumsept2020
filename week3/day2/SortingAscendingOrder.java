package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAscendingOrder {

	public static void main(String[] args) {
		
		 String[] companies = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		 
		 List<String> values=new ArrayList<String>();
		 
		 for (String eachdata : companies) {
			 
			 values.add(eachdata);
			
		}
		 
		 Collections.sort(values);
		 
		 System.out.println(values);
		 
		 Collections.sort(values);
		 
		 for (String eachvalue : values) {
			 
			 System.out.println(eachvalue);
			
		}
	}

}
