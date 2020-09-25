package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup(); 

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		Thread.sleep(2000);

		driver.findElementByXPath("(//input[@class='inputLogin'])[1]").sendKeys("demosalesmanager");

		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

		driver.findElementByXPath("//input[@type='submit']").click();

		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();

		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();

		driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();

		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
			
	    String text = driver.findElementByXPath("(//a[text()='poonguzhali'])[1]").getText();
			
	    System.out.println(text);
		
		driver.findElementByXPath("(//a[text()='poonguzhali'])[1]").click();
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
		Thread.sleep(2000);
		
		String text2 = driver.findElementByXPath("//span[text()='poonguzhali']").getText();
		
		System.out.println(text2);
		
		Thread.sleep(2000);
		
		if(text2.equals(text)) {
			
			System.out.println("Duplicated lead name is same as captured name");
			
			}
		else {
			System.out.println("Duplicated lead name is not same as captured name");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
       
		
		
		

	}

}
