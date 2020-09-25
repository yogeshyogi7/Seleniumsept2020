package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/radio.html");
		
		driver.findElementById("yes").click();
		
		boolean selected = driver.findElementByXPath("(//input[@value='1'])[2]").isSelected();
		
		if(selected)
		{
			System.out.println("Radiobutton is checked");
		}
		else {
			System.out.println("Radiobutton is not checked");
		}
		
        boolean selected1 = driver.findElementByXPath("(//input[@value='1'])[3]").isSelected();
		
		if(selected1)
		{
			System.out.println("Radiobutton is checked");
		}
		else {
			System.out.println("Radiobutton is not checked");
		}
		
		boolean selected2 = driver.findElementByXPath("(//input[@value='0'])[3]").isSelected();
		
		System.out.println(selected2);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
