package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Link.html");
		
		WebElement homepage = driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]");
		
		homepage.click();
		
		driver.findElementByXPath("//img[@alt='Link']").click();
		
		String attribute = driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href");
		
		System.out.println(attribute);
		
		String attribute2 = driver.findElementByXPath("//a[text()='Verify am I broken?']").getAttribute("href");
		
		System.out.println(attribute2);
		
        driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		}
		
		
		

	}


