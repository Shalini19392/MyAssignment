package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListPrice {

	

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> allprice =driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<String> phone=new ArrayList<String>();
		for (WebElement each : allprice) {
			String phprice=each.getText();
			phone.add(phprice);	
		}	
System.out.println(phone);
	}

}
