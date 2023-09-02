package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By usernamefield = By.xpath("//*[@id=\"username\"]");
	By passwordfield = By.xpath("//*[@id=\"password\"]");
	By loginbutton = By.xpath("//*[@id=\"submit\"]");

	// initializing objects
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickLoginBtn() {
		driver.findElement(loginbutton).click();
	}

	// specifying email and password
	public void setvalues(String UN, String PWD) {
		driver.findElement(usernamefield).clear();
		driver.findElement(passwordfield).clear();
		driver.findElement(usernamefield).sendKeys(UN);
		driver.findElement(passwordfield).sendKeys(PWD);
	}

}
