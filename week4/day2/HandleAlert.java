package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {
	
	public static void main(String[] args) throws InterruptedException {
				
				 WebDriverManager.chromedriver().setup();

					ChromeDriver driver = new ChromeDriver();

					driver.manage().window().maximize();

					driver.get("http://leafground.com/pages/Alert.html");
					
					driver.findElementByXPath("//button[text()='Alert Box']").click();
					
					Alert alert = driver.switchTo().alert();
					
					String text = alert.getText();
					
					System.out.println(text);
					
					alert.accept();
					
					driver.findElementByXPath("//button[text()='Confirm Box']").click();
					
					String text1 = alert.getText();
					
					System.out.println(text1);
			
					alert.dismiss();
					
					driver.findElementByXPath("//button[text()='Prompt Box']").click();
					
					String text2 = alert.getText();
					
					System.out.println(text2);
					
					alert.sendKeys("boss");
					
					alert.accept();
					
					driver.findElementByXPath("//button[text()='Line Breaks?']").click();
					
					String text3 = alert.getText();
					
					System.out.println(text3);
					
					alert.accept();
					
					driver.findElementByXPath("//button[text()='Sweet Alert']").click();
					
					Thread.sleep(2000);
					
					String text4 = driver.findElementByXPath("//div[text()='Happy Coding!']").getText();
					
					System.out.println(text4);
					
					driver.findElementByXPath("//button[text()='OK']").click();
					
					
					
					

	}

}
