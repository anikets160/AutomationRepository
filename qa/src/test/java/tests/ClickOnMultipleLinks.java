package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickOnMultipleLinks {

	@Test
	public void secondTest()
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
				
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (WebElement webElement : links) {
			
			System.out.println(webElement.getAttribute("href"));
		}
		
		for(int i = 1;i<links.size();i++)
		{
			
			String tabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
			links.get(i).sendKeys(tabs);
			
		}
		
		driver.quit();
	}
	
	
}
