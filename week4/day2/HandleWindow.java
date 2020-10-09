package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args)  {
		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://leafground.com/pages/Window.html");
		
		driver.findElementByXPath("//button[text()='Open Home Page']").click();
		
		Set<String> setOfHandles = driver.getWindowHandles();
		
		List<String> listOfWindows=new ArrayList<String>(setOfHandles);
		
		String firstWindow = listOfWindows.get(1);
		
		driver.switchTo().window(firstWindow);
		
		driver.close();
		
		String defaultWindow = listOfWindows.get(0);
		
		driver.switchTo().window(defaultWindow);
		
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		
	    int size = driver.getWindowHandles().size();
	    
	    System.out.println(size);
	    
        Set<String> setOfHandles1 = driver.getWindowHandles();
		
		List<String> listOfWindows1=new ArrayList<String>(setOfHandles1);
		
		String mulWindow1 = listOfWindows1.get(1);
		
		driver.switchTo().window(mulWindow1);
		
		driver.close();
		
       String mulWindow2 = listOfWindows1.get(2);
		
		driver.switchTo().window(mulWindow2);
		
		driver.close();
		
       String defaultWindow1 = listOfWindows1.get(0);
		
		driver.switchTo().window(defaultWindow1);
	   
	    
		
       driver.findElementByXPath("//button[text()='Do not close me ']").click();
       
       Set<String> setOfHandles2 = driver.getWindowHandles();
		
		List<String> listOfWindows2=new ArrayList<String>(setOfHandles2);
		
		String mulWindow3 = listOfWindows2.get(1);
		
		driver.switchTo().window(mulWindow3);
		
		driver.close();
		
       String mulWindow4 = listOfWindows2.get(2);
		
		driver.switchTo().window(mulWindow4);
		
		driver.close();
		
       String defaultWindow2 = listOfWindows2.get(0);
		
		driver.switchTo().window(defaultWindow2);
		
		driver.findElementByXPath("//button[text()='Wait for 5 seconds']").click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
