package week4.day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcWindow {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.irctc.co.in/nget/train-search");
			
			driver.findElementByXPath("(//button[@type='submit'])[1]").click();
			
			driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
			
			Set<String> setOfHandles = driver.getWindowHandles();
			
			List<String> listOfHandles=new ArrayList<String>(setOfHandles);
			
			String secondWindow = listOfHandles.get(1);
			
			driver.switchTo().window(secondWindow);
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			String firstWindow = listOfHandles.get(0);
			
			driver.switchTo().window(firstWindow);
			
			driver.close();
			
			

	}

}
