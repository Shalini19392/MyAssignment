package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		//Launch the driver
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		//Launch the url
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the window
		driver.manage().window().maximize();
		//Global time wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Enter Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on decorativeSubmit button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRM link
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click on Lead tab
		driver.findElement(By.linkText("Leads")).click();
		//Click on Find lead tab
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Click on Phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter Phone number field
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98");
		//Click on Find Lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Select Lead id
		driver.findElement(By.xpath("//a[text()='10034']")).click();
		//Click on Delete button
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//Click on Find Lead button
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Click on Name and ID button
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		//Entering Lead id
		driver.findElement(By.name("id")).sendKeys("10060");
		//Click on Find Lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//get Current page title
		String S=driver.getTitle();
		System.out.println("Title:" +S);
		//Close the current browser
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
