package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//button[@id='Click']").click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		driver.findElementByXPath("//button[@id='Click1']").click();
		
		driver.switchTo().defaultContent();
		
		int size = driver.findElementsByTagName("iframe").size();
		
		System.out.println(size);
		
		int count = size;
		
		for (int i = 0; i < size; i++) {
			
			driver.switchTo().frame(i);
			count = count + driver.findElementsByTagName("iframe").size();
			driver.switchTo().defaultContent();
		}
		System.out.println(count);
		
		
		
		
		
		


	}

}
