package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead { 
	
	public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//input[@class='inputLogin'])[1]").sendKeys("demosalesmanager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		
		
		
//		driver.findElementById("username").sendKeys("demosalesmanager");
//		
//		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
//		
//		driver.findElementByClassName("decorativeSubmit").click();
//		
//		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("testleaf");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("test");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("abc");
		
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		
		Select dropdown=new Select(source);
		
		dropdown.selectByVisibleText("Employee");
		
        WebElement marketing=driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dropdown1=new Select(marketing);
		
		dropdown1.selectByValue("9001");
		
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
		
		Select dropdown2=new Select(industry);
		
		List<WebElement> options = dropdown2.getOptions();
		
		int size = options.size();
		
		dropdown2.selectByIndex(size-2);
		
		WebElement ownership=driver.findElementById("createLeadForm_ownershipEnumId");
		
		Select dropdown3=new Select(ownership);
		
		dropdown3.selectByIndex(2);
		
        WebElement country=driver.findElementById("createLeadForm_generalCountryGeoId");
		
		Select dropdown4=new Select(country);
		
		dropdown4.selectByVisibleText("India");
		
		Thread.sleep(3000);
		
		driver.findElementByName("submitButton").click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
