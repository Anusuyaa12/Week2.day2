package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * select by index
		 * select by text
		 * select by value
		 * get the no of dropdown option
		 * use sendkeys to select
		 * select your program */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(1);
		Thread.sleep(5000);
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("Selenium");
		Thread.sleep(5000);
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("1");
		driver.findElement(By.xpath("//div[@class='example']/following::select[4]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//option[@disabled='true']/following-sibling::option[1]")).click();

	}

}
