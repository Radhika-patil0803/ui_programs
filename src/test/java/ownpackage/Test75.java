package ownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test75 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("magnitiabatch251");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Magnitia251");
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(5000);
	}

}
