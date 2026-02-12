package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infinite");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shalini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		WebElement SourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select S =new Select(SourceDD);
		S.selectByIndex(4);
		WebElement MarketDD=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select S1 =new Select(MarketDD);
		S1.selectByVisibleText("Automobile");
		WebElement OwnerDD=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select S2=new Select(OwnerDD);
		S2.selectByValue("OWN_PARTNERSHIP");
		driver.findElement(By.name("submitButton")).click();
		 String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		String expected ="View Lead | opentaps CRM";
		if (pageTitle.equals(expected))
		{
			System.out.println("True");
			
		}
		else
		{
			System.out.println("False");	
		}
		//driver.close();

	}

}
