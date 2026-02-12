package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
@SuppressWarnings("unused")

	public static void main(String[] args) {
	//Launch the driver
		ChromeDriver driver = new ChromeDriver();
		//Launch the url
		driver.get("https://en-gb.facebook.com/");
		//Maximize the window
		driver.manage().window().maximize();
		//Global time wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Click on Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter Firstanme
		driver.findElement(By.name("firstname")).sendKeys("Shalini");
		//Enter Lastname
		driver.findElement(By.name("lastname")).sendKeys("S");
		//Enetr Registered emailid
		driver.findElement(By.name("reg_email__")).sendKeys("Shaliniselvaraj0806@gmail.com");
		//Enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Shalini19392");
		//Select day from dropdown
		WebElement day=driver.findElement(By.id("day"));
		Select S= new Select(day);
		S.selectByIndex(18);
		//Select month from dropdown
		WebElement month=driver.findElement(By.id("month"));
		Select S1= new Select(month);
		S1.selectByVisibleText("Mar");
		//select year from dropdown
		WebElement year=driver.findElement(By.id("year"));
		Select S2= new Select(year);
		S2.selectByValue("1992");
		//Click on Gender option
		driver.findElement(By.xpath("//label[text()='Female']")).click();
				
	}

}
