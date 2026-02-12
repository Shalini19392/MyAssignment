package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("shaliniselvaraj0806@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Wed@2016");
		driver.findElement(By.name("login")).click();	
		 String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		driver.close();
	}

}
