package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeads {
public static void main(String[] args) {
	//Launch the driver
		ChromeDriver driver = new ChromeDriver();
		//Launch the url
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the window
		driver.manage().window().maximize();
		//Global time wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//ENter Username
		driver.findElement(By.id("username")).sendKeys("democsr2");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Clcikon submit
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click on Leads button
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		//Enetr Companyname
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Infinite");
		//Enter Firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Shalini");
		//ENter Lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
		//Enter
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("shal");
		//ENter department name
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		//Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Tetsing");
		//Enter emailid
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Shaliniselvaraj0806@gmail.com");
		//Select state from dropdown
		WebElement stateDD =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select S1 =new Select(stateDD);
				S1.selectByVisibleText("Arizona");
		//Clickon Submit button
		driver.findElement(By.name("submitButton")).click();
		//Clickon Edit button
		WebElement editbutton=driver.findElement(By.linkText("Edit"));
		editbutton.click();
		//Clear the description
		WebElement cleardescription=driver.findElement(By.id("updateLeadForm_description"));
		cleardescription.clear();
		//Entar important note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("test");
		//Clickon submit button
		driver.findElement(By.name("submitButton")).click();
		//Current Page tiltle
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		//Close the current window browser
		driver.close();
}
}
