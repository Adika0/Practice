package Param;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).sendKeys("Pune");
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[2]")).sendKeys("Gujrath");
		driver.findElement(By.xpath("//span[contains(@class,'sc-12foipm-92 ')]")).click();
		System.out.println();
		
		

	}

}
