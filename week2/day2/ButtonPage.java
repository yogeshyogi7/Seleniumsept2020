package week2.day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) throws InterruptedException {
 
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("http://leafground.com/pages/Button.html");
			
			driver.findElementById("home").click();
			
			driver.findElementByXPath("//h5[text()='Button']").click();
			
			Point location = driver.findElementByXPath("//button[text()='Get Position']").getLocation();
			
			System.out.println(location);
			
			String color = driver.findElementById("color").getCssValue("background-color");
			
			System.out.println(color);
			
			Dimension size = driver.findElementById("size").getSize();
			
			System.out.println(size);
			
			Thread.sleep(2000);
			
			driver.close();

	}

}
