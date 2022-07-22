package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		/*
		 * Click button to travel home page
		 * Find position of button (x,y)
		 * Find button color
		 * Find the height and width */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		Point location = (Point) driver.findElement(By.id("position")).getLocation();
		System.out.println(location);
		WebElement cssValue = driver.findElement(By.id("color"));
		System.out.println(cssValue.getCssValue("background-color"));
		WebElement cssValue2 = driver.findElement(By.id("size"));
		System.out.println(cssValue2.getSize());
		driver.findElement(By.id("home")).click();		
	}
}



