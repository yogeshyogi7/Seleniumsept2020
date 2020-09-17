package week1.day2;

public class Calculator {
	
	public int add(int x,int y) {
		return x+y;
	}
	
	public double multiplication(double a,double b) {
	
		return a*b;
	}
	
	public int sub(int m,int n) {
		return m-n;
		
	}

	public static void main(String[] args) {
		
		Calculator res = new Calculator();
		
		System.out.println(res.add(10, 20));
		
		double multiplication=res.multiplication(10,20);
		System.out.println(multiplication);
		
		int sub=res.sub(40,20);
		System.out.println(sub);
		
		
	}

}
