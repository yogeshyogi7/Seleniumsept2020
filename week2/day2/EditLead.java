package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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

		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Sam");

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(2000);

		driver.findElementByXPath("//a[@href='/crmsfa/control/viewLead?partyId=10014']").click();

		String title = driver.getTitle();

		System.out.println(title);

		driver.findElementByXPath("//a[text()='Edit']").click();

		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();

		//Actions actions=new Actions(driver);
		  
		//WebElement companyname=driver.findElementByXPath("(//input[@name='companyName'])[2]");
		  
		//actions.doubleClick(companyname).perform();
		  
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TCS");
		  
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		
		boolean displayed = driver.findElementByXPath("//span[contains(text(),'TCS')]").isDisplayed();
		
		if(displayed)
		{
			System.out.println("The change name is appeared");
		}
		else {
			System.out.println("The change name is not appeared");
		}
		  
		Thread.sleep(2000);
		  
		driver.close();
		 

	}

}
