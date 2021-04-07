package ownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMoveTo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		WebElement gmail_link=driver.findElement(By.linkText("Gmail"));
		act.moveToElement(gmail_link).click().perform();
		Thread.sleep(5000);
		WebElement sign_in=driver.findElement(By.partialLinkText("Sign in"));
		act.moveToElement(sign_in).click().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
