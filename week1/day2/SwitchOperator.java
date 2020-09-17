package week1.day2;

public class SwitchOperator {

	public static void main(String[] args) {
		
		int a=2,b=3;
		
		int c;
		
		String operator="add";
		
		switch (operator) {
		case "add": c=a+b;
		           System.out.println(c);
		           break;
		
		case "sub":c=b-a;
		           System.out.println(c);
		           break;
		           
		case "mul":c=a*b;
		           System.out.println(c);
                   break;
                   
		case "div":c=a/b;
		           System.out.println(c);
		           break;
		           
        default:System.out.println("Invalid Operator");
			    break;
		}
				

	}

}
