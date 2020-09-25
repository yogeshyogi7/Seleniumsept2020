package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();
		
		driver.findElementByXPath("(//input[@type='checkbox'])[5]").click();
		
		boolean selected = driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
		
		System.out.println(selected);
		
		driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
		
		driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
		
		driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
		
		driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
		
		driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
		
		driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		

	}

}
