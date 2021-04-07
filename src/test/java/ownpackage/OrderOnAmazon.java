package ownpackage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderOnAmazon {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.amazon.in");
		WebDriverWait w= new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Search']"))).sendKeys("car bedsheets for kids");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Go']"))).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@data-image-index='2']"))).click();
		Set<String> set=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(set);
		driver.switchTo().window(al.get(1));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='submit.add-to-cart']"))).click();

	}

}
