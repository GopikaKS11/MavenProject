package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";

	@BeforeClass
	public void websiteOpen() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void websiteClose() {
		System.out.println("<<<<<COMPLETED>>>>>");
	}

}
