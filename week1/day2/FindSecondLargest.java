package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] a = {3,2,11,4,6,7};
		
		Arrays.sort(a);
		
		int size=a.length;
		
		System.out.println(a[size-2]);

	}

}
