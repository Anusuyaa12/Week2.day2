package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
	
		/*http://leaftaps.com/opentaps/control/main		 
		Delete Lead:
			1	Launch the browser
			2	Enter the username
			3	Enter the password
			4	Click Login
			5	Click crm/sfa link
			6	Click Leads link
			7	Click Find leads
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
			8	Click on Phone
			9	Enter phone number
			10	Click find leads button
			11	Capture lead ID of First Resulting lead
			12	Click First Resulting lead
			13	Click Delete
			14	Click Find leads
			15	Enter captured lead ID
			16	Click find leads button
			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			18	Close the browser (Do not log out) */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		String obj = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(obj);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement noRecord = driver.findElement(By.xpath("//div[text()='No records to display']"));
//		WebElement displayingrecord = driver.findElement(By.xpath("//div[contains(text(),'Displaying records')]"));
		if(noRecord.isDisplayed())
			System.out.println("The first record is deleted and not found on search ");
		else System.out.println("The first record not deleted and displayed on search");
	}

}
