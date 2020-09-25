package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLogIn {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/login");
		
		Thread.sleep(2000);
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElementByName("password").sendKeys("leaf@12");
		 
		driver.findElementByXPath("//button[@type='submit']").click();
		
		Thread.sleep(2000);
		
        String title=driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Log Out").click();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
