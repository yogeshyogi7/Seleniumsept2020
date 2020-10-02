package week3.day1;

public class Calculator {
	
	public void add(int a,int b) {
		
		System.out.println(a+b);
		}
	
	public void add(int c,int d,int e) {
		
		System.out.println(c+d+e);
		
	}
	
	public void multiply(int a,int b) {
		
		System.out.println(a*b);
		
	}
	
    public void multiply(int a,double b) {
		
		System.out.println(a*b);
		
	}
    
    public void subtract(int a,int b) {
    	
    	System.out.println(a-b);
    	
    }
    
    public void subtract(double a,double b) {
    	
    	System.out.println(a-b);
    	
    }
    
    public void divide(int a,int b) {
    	
    	System.out.println(a/b);
    }
    
    public void divide(double a,int b) {
    	
    	System.out.println(a/b);
    }
 
 
    public static void main(String[] args) {
    	
    	Calculator cal=new Calculator();
    	
    	cal.add(2, 3);
    	cal.add(2, 3, 4);
    	cal.multiply(2,3);
    	cal.multiply(2, 3);
    	cal.subtract(5, 3);
    	cal.subtract(5, 3);
    	cal.divide(4, 2);
    	cal.divide(4, 2);
		
	}
	
	
	
	
}
