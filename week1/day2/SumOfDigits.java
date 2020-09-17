package week1.day2;

import java.util.Arrays;

public class SumOfDigits {

	public static void main(String[] args) {
		
       int[] a= {3,2,11,4,6,7};
		
		Arrays.sort(a);
		
		int arraySize=a.length;
		
		System.out.println(a[arraySize-2]);
	}
}
	
		
	   /* int input=123; 
	    int sum=0; 
	    int rem;
		  
		  while(input>0) {
		  
		  rem= input % 10;
		  
		  sum=sum+rem;
		  
		  input=input/10;
		  
		  } System.out.println(sum);
		 
	}
}*/


