package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateAccount {
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
		//Clickon Create account button
		driver.findElement(By.partialLinkText("Create Account")).click();
		//Enter Account name
		driver.findElement(By.id("accountName")).sendKeys("TestleafSS2");
		//Enter description
		driver.findElement(By.name("description")).sendKeys("demo");
		//Select ndustry from dropdown
		WebElement industryDD=driver.findElement(By.name("industryEnumId"));
		Select s1 =new Select(industryDD);
		s1.selectByValue("IND_SOFTWARE");
		//Select Ownership from dropdown
		WebElement ownershipDD=driver.findElement(By.name("ownershipEnumId"));
		Select s2 =new Select(ownershipDD);
		s2.selectByVisibleText("S-Corporation");
		//Select Source from dropdown
		WebElement sourceDD= driver.findElement(By.id("dataSourceId"));
		Select s3 =new Select(sourceDD);
		s3.selectByVisibleText("Employee");
		//Select market from dropdown
		WebElement marketDD= driver.findElement(By.id("marketingCampaignId"));
		Select s4 =new Select(marketDD);
		s4.selectByValue("9000");
		//Select state from dropdown
		WebElement stateDD= driver.findElement(By.name("generalStateProvinceGeoId"));
		Select s5 =new Select(stateDD);
		s5.selectByValue("AZ");
		//Click on submit button
		driver.findElement(By.className("smallSubmit")).click();
		//Get accountname
		String accountName ="TestleafSS2";
		System.out.println("Account Name: " + accountName);
		//Close the current  browser window
		driver.close();
}
}
