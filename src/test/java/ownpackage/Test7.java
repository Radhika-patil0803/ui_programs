package ownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com");
	driver.findElement(By.name("identifier")).sendKeys("littlekrishna3001@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("password")).sendKeys("LittleRishwa");
	driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
	Thread.sleep(5000);
	try
	{
	for(int i=0;i<=20;i++)
	{
	driver.findElement(By.xpath("//div[text()='Compose']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.name("to")).sendKeys("littlekrishna3001@gmail.com");
	driver.findElement(By.name("subjectbox")).sendKeys("hi");
	
	driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("hello my own code");
	driver.findElement(By.xpath("//div[text()='Send']")).click();
	
	Thread.sleep(5000);
	}
	}
	catch(Exception e)
	{
		
	}
	driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Sign out']/parent::div")).click();
	
	driver.close();
	
	
	

	}

}
