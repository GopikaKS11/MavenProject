package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.LoginPage;
import utilities.Excelutils;

public class Logintest extends Baseclass {
	@Test
	public void verifyLoginnWithValidCred() {
		LoginPage p1 = new LoginPage(driver);

		// Reading data from xl file
		String filepath = "B:\\Software testing\\AutomationProject\\Login.xlsx";
		String sheetname = "Sheet1";
		int RC = Excelutils.rowcount(filepath, sheetname);
		for (int i = 1; i <= RC; i++) {
			String User = Excelutils.cellValues(filepath, sheetname, i, 0);
			System.out.println("USERNAME>>>" + User);
			String pass = Excelutils.cellValues(filepath, sheetname, i, 1);
			System.out.println("PASSWORD>>>" + pass);
			p1.setvalues(User, pass);
			p1.clickLoginBtn();
			String currenturl = driver.getCurrentUrl();
			String expurl = "https://practicetestautomation.com/logged-in-successfully/";
			if (currenturl.equalsIgnoreCase(expurl)) {
				System.out.println("LOGIN SUCESSFULL");
				driver.navigate().back();
			} else {
				System.out.println("LOGIN FAILED");
			}
		}

	}
}
