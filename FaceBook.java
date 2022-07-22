package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.time.Duration;

public class FaceBook {

	public static void main(String[] args) {
		
			/*FaceBook:
			================================
			// Step 1: Download and set the path 
			// Step 2: Launch the chromebrowser
			// Step 3: Load the URL https://en-gb.facebook.com/
			// Step 4: Maximise the window
			// Step 5: Add implicit wait
			// Step 6: Click on Create New Account button
			// Step 7: Enter the first name
			// Step 8: Enter the last name
			// Step 9: Enter the mobile number
			// Step 10: Enterthe password
			// Step 11: Handle all the three drop downs
			// Step 12: Select the radio button "Female" 
			     //( A normal click will do for this step)  */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='_6ltg'][2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anusha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mohan");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7898654908");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("jigujigu@12");
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select opt1 =  new Select(day);
		opt1.selectByValue("12");
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select opt2 = new Select(month);
		opt2.selectByIndex(11);
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select opt3 = new Select(year);
		opt3.selectByVisibleText("1995");
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
	}

}
