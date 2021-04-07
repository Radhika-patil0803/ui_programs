package ownpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test65 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to("http://www.semantic-ui.com/modules/dropdown.html");
		//locate neighour elt
		WebElement neighour_elt=driver.findElement(By.xpath("//h4[text()='Multiple Selection']"));
		//get the element into visibility
		driver.executeScript("arguments[0].scrollIntoView()",neighour_elt);
		//locate dropdown
		WebElement dropdown=driver.findElement(By.xpath("//h4[text()='Multiple Selection']/following-sibling::div"));
		Thread.sleep(3000);
		//testcase-1
		if(dropdown.getAttribute("class").contains("multiple"))
		{
			System.out.println("it is a multiple select dropdown");
			
			//collect all items in it and display item text
			List<WebElement> multiselectList=dropdown.findElements(By.xpath("child::div[2]/div"));
			System.out.println("no.of items in multiselect list are:"+multiselectList.size());
			System.out.println("those 19 items are:");
			for(WebElement eachitem:multiselectList)
			{
				String item=(String) driver.executeScript("return(arguments[0].textContent)",eachitem);
				System.out.println(item);
				
			}
			
			//selct each item in dropdown and remove
			for(WebElement item:multiselectList)
			{
				dropdown.click();
				Thread.sleep(3000);
				if(item.isDisplayed())
				{
				String expected =item.getText();
				item.click();
				Thread.sleep(3000);
				String actual=dropdown.findElement(By.xpath("child::a")).getText();
				if(expected.equals(actual))
				{
					System.out.println("element select test passed");
				}
				else
				{
					System.out.println("element select test failed");
				}
				}
			}
		}
		

	}

}
