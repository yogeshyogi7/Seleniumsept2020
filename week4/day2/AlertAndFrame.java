package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAndFrame {
	
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			
			driver.switchTo().frame("iframeResult");
			
			driver.findElementByXPath("//button[text()='Try it']").click();
			
			Alert alert = driver.switchTo().alert();
			
			alert.sendKeys("boss");
			
			alert.accept();
			
			String text = driver.findElementByXPath("//p[@id='demo']").getText();
			
			System.out.println(text);
			
			if(text.contains("boss"))
			{
				System.out.println("The text entered is appeared");
			}
			else {
				
				System.out.println("The text entered is not appeared");
			}
		
		
		
	}

}
