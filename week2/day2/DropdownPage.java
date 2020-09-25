package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement index=driver.findElementByXPath("//select[@id='dropdown1']");
		
		Select dropdown1=new Select(index);
		
		dropdown1.selectByIndex(2);
		
        WebElement text=driver.findElementByXPath("//select[@name='dropdown2']");
		
		Select dropdown2=new Select(text);
		
		dropdown2.selectByVisibleText("UFT/QTP"); 
		
        WebElement value=driver.findElementByXPath("//select[@id='dropdown3']");
		
		Select dropdown3=new Select(value);
		
		dropdown3.selectByValue("4");
		
        WebElement number=driver.findElementByXPath("//select[@class='dropdown']");
		
		Select dropdown4=new Select(number);
		
		List<WebElement> options = dropdown4.getOptions();
		
		int size = options.size();
		
		System.out.println(size);
		
		driver.findElementByXPath("(//section[@class='innerblock']//select)[5]").sendKeys("Selenium");
		
		WebElement multiple = driver.findElementByXPath("(//section[@class='innerblock']//select)[6]");
		
		Select dropdown6=new Select(multiple);
		
		dropdown6.selectByIndex(1);
		
		Thread.sleep(2000);
		
		dropdown6.selectByIndex(3);
		
		Thread.sleep(2000);
		
		dropdown6.deselectByIndex(1);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
			
	    
		
		
		

	}

}
