package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.snapdeal.com/");
			
			Thread.sleep(2000);
			
			WebElement mens = driver.findElementByXPath("(//a[@class='menuLinks leftCategoriesProduct '])[6]");
			
			Thread.sleep(2000);
			
			Actions actions=new Actions(driver);
			
			actions.moveToElement(mens).perform();
			
			Thread.sleep(2000);
			
			driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
			
			WebElement quick = driver.findElementByXPath("//div[@pogid='635125584570']");
			
			actions.moveToElement(quick).click(quick).perform();
			
			

	}

}
