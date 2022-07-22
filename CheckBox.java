package Week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {

		/*
		 * Select the languages that you know?
		 * Confirm Selenium is checked
		 * DeSelect only checked
		 * Select all below checkboxes */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).click();
		boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();
		System.out.println(selected);
		driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input"));
		for(int i=0; i < findElements.size(); i++ )
			//findElements.click
			findElements.get(i).click();
	}

}
