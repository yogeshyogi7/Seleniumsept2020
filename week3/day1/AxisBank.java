package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		
		System.out.println("Account deposited child");
	}

	public static void main(String[] args) {
		
		AxisBank info=new AxisBank();
		
		info.saving();
		info.fixed();
		info.deposit();
		
		

	}

}
