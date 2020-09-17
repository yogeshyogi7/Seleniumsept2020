package week1.day1;

public class Mobile {
	
	 long mobNumber= 8500374546L;
	 String mobColor="White";
	 double mobWeight=75.55;
	 boolean isRefurbished=true;
	
	
	public void makeCall() {
		System.out.println("Call connected");
	}
	
	public void sendMessage() {
		System.out.println("Message sent");
	}
	
	public void takePhoto() {
		System.out.println("Picture is saved");
	}

	public static void main(String[] args) {
		
		Mobile Obj=new Mobile();
		Obj.makeCall();
		Obj.sendMessage();
		Obj.takePhoto();
		
		long number= Obj.mobNumber;
		System.out.println(number);
		
		String color=Obj.mobColor;
		System.out.println(color);
		
		System.out.println(Obj.mobWeight);
		System.out.println(Obj.isRefurbished);
		

	}

}
