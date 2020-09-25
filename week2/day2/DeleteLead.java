package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
		
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("81");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
		String text = driver.findElementByXPath("//a[text()='10237']").getText();
		
		System.out.println(text);
		
		driver.findElementByXPath("//a[text()='10237']").click();
		
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("10237");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
		boolean displayed = driver.findElementByXPath("//div[@id='ext-gen304']//div").isDisplayed();
		
		if(displayed)
		{
			System.out.println("The records is successfully deleted");
		}
		else {
			System.out.println("The records is displayed");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
