package ownpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoOfSearches {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to("http://www.google.co.in");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("radhika",Keys.ENTER);
		
		int nor=0;
		int pn=1;
		try
		{
		while(true)
		{
		List<WebElement> links=driver.findElements(By.className("g"));
		nor=nor+links.size();
		//System.out.println("no.of links containing href attribute"+links.size());
		if(pn==1)
		{
			System.out.println(pn+"1st page consists of"+links.size());
		}
		else if(pn==2)
		{
			System.out.println(pn+"nd page consists of "+links.size());
		}
		else if(pn==3)
		{
			System.out.println(pn+"rd page consists of "+links.size());
		}
		else 
		{
			System.out.println(pn+"th page consists of "+links.size());
		}
		pn++;
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(2000);
		}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("total no.of links available for this search is:"+nor);
		driver.close();
		

	}

}
