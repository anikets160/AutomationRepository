package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class FirstTest {
	
	@Test
	public void firstTest()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(htmlReporter);
		
		ExtentTest test = extentReport.createTest("first Test", "This is first test");
		
		test.log(Status.PASS, "The test is passed");
		
		extentReport.flush();
		
		System.out.println("First Test Updated");
	}

	@Test
	public void secondTest()
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}
	
	
}
