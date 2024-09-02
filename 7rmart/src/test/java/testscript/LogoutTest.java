package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	
	@Test (description = "Verify if user is able to log out from the application",groups= {"Regression"})
	public void verifyIfAdminIsAbleToLogOut() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.enterUsernameOnUsernameField(username);
		logoutpage.enterPasswordOnPasswordField(password);
		logoutpage.clickOnSignInButton();
		logoutpage.clickOnAdminButton();
		logoutpage.clickOnlogoutButton();
		boolean loginpageloginbutton = logoutpage.checkIfLoginButtonIsDisplayed();
		assertTrue(loginpageloginbutton);
	}
}
