package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.findElementByXPath("(//input[@class='inputLogin'])[1]").sendKeys("demosalesmanager");
			
			driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
			
			driver.findElementByXPath("//input[@type='submit']").click();
			
			driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
			
			driver.findElementByXPath("//a[text()='Leads']").click();
			
			driver.findElementByXPath("//a[text()='Merge Leads']").click();
			
			driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
			
			Set<String> setOfWindows = driver.getWindowHandles();
			
			List<String> listOfWindows=new ArrayList<String>(setOfWindows);
			
			String firstWindow = listOfWindows.get(1);
			 
			driver.switchTo().window(firstWindow);
			
			driver.findElementByXPath("//input[@name='id']").sendKeys("10041");
			
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			Thread.sleep(3000);
			
			driver.findElementByXPath("//a[text()='10041']").click();
			
            String defaultWindow = listOfWindows.get(0);
			
			driver.switchTo().window(defaultWindow);
			
			driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
			
            Set<String> setOfWindows1 = driver.getWindowHandles();
			
			List<String> listOfWindows1=new ArrayList<String>(setOfWindows1);
			
			String firstWindow1 = listOfWindows1.get(1);
			
			driver.switchTo().window(firstWindow1);
			
			driver.findElementByXPath("//input[@name='id']").sendKeys("10052");
			
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			Thread.sleep(3000);
			
			driver.findElementByLinkText("10052").click();
			
			 String defaultWindow1 = listOfWindows1.get(0);
				
		    driver.switchTo().window(defaultWindow1);
		    
		    driver.findElementByXPath("//a[text()='Merge']").click();
		    
		    Alert alert = driver.switchTo().alert();
		    
		    alert.accept();
		    
		    driver.findElementByXPath("//a[text()='Find Leads']").click();
		    
		    driver.findElementByXPath("//input[@name='id']").sendKeys("10041");
		    
		    driver.findElementByXPath("//button[text()='Find Leads']").click();
		    
		    boolean displayed = driver.findElementByXPath("//div[text()='No records to display']").isDisplayed();
		    
		    System.out.println(displayed);
		    
		    
		    
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	}

}
