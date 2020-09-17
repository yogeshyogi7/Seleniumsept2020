package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input=153;
		int org=153;
		int rem;
		int calculated=0;
		
		while(input>0) {
			
			rem= input % 10;
			
			calculated=calculated+(rem*rem*rem);
			
			input=input/10;
			
			}
		
		if(calculated==org) {
			System.out.println("It is an Armstrong number");
			}
		else {
			System.out.println("It is not an Armstrong number");
			
		}
		
		

	}

}
