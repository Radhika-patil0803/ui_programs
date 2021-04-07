package ownpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test54 {

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
	Thread.sleep(10000);
	
	//mail box testing via pagination
	int expected_all_mail_count=0;
	while(true)
	{
		WebElement mailbox=driver.findElement(By.xpath("(//table)[7]/tbody"));
		List<WebElement> no_of_mails=mailbox.findElements(By.xpath("child::tr"));
		expected_all_mail_count=expected_all_mail_count+no_of_mails.size();
		
		try
		{
			if(driver.findElement(By.xpath("//div[@data-tooltip='Older']")).getAttribute("aria-disabled").equals("true"))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[@data-tooltip='Older']")).click();
				Thread.sleep(5000);
			}
		}
		catch(NullPointerException npe)
		{
			driver.findElement(By.xpath("//div[@data-tooltip='Older']")).click();
			Thread.sleep(5000);
		}
		
	}
	System.out.println("all mails in your gmail account are:"+expected_all_mail_count);
	
	driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Sign out']/parent::div")).click();
	
	driver.close();
	
	
	

	}

}
