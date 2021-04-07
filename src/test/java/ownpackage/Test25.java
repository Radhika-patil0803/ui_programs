package ownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test25 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("littlekrishna",Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).clear();
		driver.findElement(By.name("identifier")).sendKeys("littlekrishna3001",Keys.ENTER);
		


	}

}
