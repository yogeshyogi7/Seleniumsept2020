package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://erail.in/");
			
			Thread.sleep(2000);
			
			driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
			
			driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
			
			driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("ms");
			
			driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys(Keys.TAB);
			
            driver.findElementByXPath("//input[@id='txtStationTo']").clear();
			
			driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("mdu");
			
			driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			int rowsCount = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr").size();
			
			List<String> listtrains=new ArrayList<String>();
			
			for (int i = 1; i < rowsCount; i++) {
				
				String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
				 
				System.out.println(text);
				
				listtrains.add(text);
				
				}
			
			int size = listtrains.size();
			
			Set<String> setsize =new HashSet<String>(listtrains);
			
			int length = setsize.size();
			
			
			if(size==length)
			{
				System.out.println("No duplicates");
			}
			
			else
			{
				System.out.println("Duplicates");
			}
			
			
			
			
			
			
			
			
			
			
			

	}

}
