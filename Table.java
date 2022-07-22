package Week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		/* 
		 * Get the count of number of columns
		 * Get the count of number of rows
		 * Get the progress value of 'Learn to interact with Elements'
		 * Check the vital task for the least completed progress.*/
		int value;
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> col = driver.findElements(By.tagName("th"));
		System.out.println(col.size());
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		System.out.println(row.size());
		List<WebElement> progressValue = driver.findElements(By.xpath("//font[contains(text(),'Learn to interact with')]//following::font[1]"));
		for(int i=0; i < progressValue.size(); i++) {
			String percentage = progressValue.get(i).getText();
			System.out.println("Learn to interact with elemetns values are : "+percentage);
		}
		List<WebElement> percentageValue = driver.findElements(By.xpath("//font[contains(text(),'%')]"));
		  String[] array = new String[percentageValue.size()];
		  
		for(int i=0; i<array.length; i++ )
		{
			
			array[i] = percentageValue.get(i).getText();
			System.out.println(array[i]);
	
		System.out.println("minimum "+array[0]);
	}

}
}