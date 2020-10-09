package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://jqueryui.com/droppable/");
			
			Thread.sleep(2000);
			
			driver.switchTo().frame(0);
			
			WebElement source = driver.findElementById("draggable");
			
			WebElement target = driver.findElementById("droppable");
			
			Actions actions=new Actions(driver);
			
			actions.dragAndDrop(source, target).perform();
			
			}




	}


