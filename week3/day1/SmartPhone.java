package week3.day1;

public class SmartPhone extends AndroidPhone {

public void connectWhatsapp() {
		
		System.out.println("Connecting Whatsapp");

	}

public void takeVideo() {
	
	System.out.println("Taking a video Child");
}

	public static void main(String[] args) {
		
		SmartPhone sp =new SmartPhone();
		
		
		sp.sendMsg();	
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		sp.connectWhatsapp();
		
		
		
				}

	}


