package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("http://leafground.com/pages/Edit.html");
			
			driver.findElementById("email").sendKeys("yogesh13300@gmail.com");
			
			driver.findElementByXPath("//input[@value='Append ']").clear();
			
			driver.findElementByXPath("//input[@value='Append ']").sendKeys("abc");
			
			String attribute = driver.findElementByName("username").getAttribute("value");
			
			System.out.println(attribute);
			
			driver.findElementByXPath("//input[@value='Clear me!!']").clear();
			
			boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
				
			System.out.println(enabled);
			
			boolean enabled2 = driver.findElementByName("username").isEnabled();
			
			System.out.println(enabled2);
			
            Thread.sleep(2000);
			
			driver.close();
   
			
			
		
			}

	}


