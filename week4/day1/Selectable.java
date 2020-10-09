package week4.day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://jqueryui.com/selectable/");
			
            JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,500)");
			
			driver.switchTo().frame(0);
			
			WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		
		    WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		  
		    WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
			WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
			
			Actions actions=new Actions(driver);
			
	        actions.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).perform();	
			
			

	}



	}


