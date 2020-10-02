package week3.day2;

public class Desktop implements Hardware,Software {
	
	public void desktopModel() {
		
		System.out.println("Desktop model is 8080");

	}

	public static void main(String[] args) {
		
		Desktop details=new Desktop();
		
		details.hardwardResources();
		details.softwareResources();
		details.desktopModel();
		
		}


	public void softwareResources() {
		
		System.out.println("Software resources are 5");
	}

	
	public void hardwardResources() {
		
		System.out.println("Hardware resources are 7");
		
	}
	
	

}

