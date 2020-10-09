package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithTables {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/table.html"); 
		
		int columnCount = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td").size();
		
		System.out.println("The num of columns are "+columnCount);
		
		int rowsCount = driver.findElementsByXPath("//table[@id='table_id']//tr").size();
		
		System.out.println("The num of rows are "+rowsCount);
		
		String value = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[2]").getText();
		
		System.out.println("The progress value of 'Learnto interact with Elements' is "+value);
		
		List<WebElement> row = driver.findElementsByXPath("//table//tr/td[2]");
		
		List<Integer> progress = new ArrayList<Integer>();
		
		for (WebElement eachvalue : row) {
			
			String low = eachvalue.getText().replaceAll("%", "");
			
			int parseInt = Integer.parseInt(low);
			
			progress.add(parseInt);
			
		}
		
		Collections.sort(progress);
		
		Integer lowest = progress.get(0);
		
		System.out.println("The least completed progress is "+lowest);
		
		
		

		
		
		
		
		
		
		
		
		
		
		

	}

}
