package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException   {
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://dev68594.service-now.com/");
			
			driver.switchTo().frame("gsft_main");
			
			driver.findElementById("user_name").sendKeys("admin");
			
			driver.findElementById("user_password").sendKeys("India@123");
			
			driver.findElementById("sysverb_login").click();
			
			Thread.sleep(2000);
			
			driver.findElementByXPath("//input[@id='filter']").sendKeys("incident");
			
			Thread.sleep(2000);
			
			driver.findElementByXPath("(//div[text()='All'])[2]").click();
			
			driver.switchTo().frame(0);
			
			driver.findElementByXPath("//button[text()='New']").click();
			
			driver.findElementByXPath("//input[@id='sys_display.incident.caller_id']").sendKeys("Abel Tuter");
			
			Thread.sleep(2000);
			
			//driver.findElementByXPath("//input[@id='sys_display.incident.caller_id']").sendKeys(Keys.ENTER);
			
			driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Automation Testing");
			
			Thread.sleep(2000);
			
		    String attribute = driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
		    
		    System.out.println(attribute);
		    
		    Thread.sleep(2000);
		    
		    driver.findElementByXPath("(//button[@type='submit'])[1]").click();
		    
		    Thread.sleep(2000);
		  
		    driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(attribute);
		    
		    driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(Keys.ENTER);
		    
		    
		  
		    
		 
		    
		    
		    
		    
		    
			
			
	}

}
