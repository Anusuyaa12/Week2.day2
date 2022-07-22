package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Enter your email address
		 * Append a text and press keyboard tab
		 * Get default text entered
		 * Clear the text
		 * Confirm that edit field is disabled */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("anusha121995@gmail.com");
		driver.findElement(By.xpath("//input[contains(@value,'Append')]")).sendKeys(" Anu");
		Thread.sleep(3000);
		String defaultText = driver.findElement(By.xpath("//input[@name='username'][1]")).getText();
		System.out.println(defaultText);
		driver.findElement(By.xpath("//label[text()='Clear the text']/following::input")).clear();
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input"));
		if(findElement.isDisplayed())
			System.out.println("yes text is disabled");
		else System.out.println("not disabled");
	}

}
