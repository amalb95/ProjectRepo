package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {

	public LoginPage loginpage;
	public LogoutPage logoutpage;
	public AdminUserPage adminuserpage;

	@Test(description = "Verify if user is able to log out from the application", groups = { "Regression" })
	public void verifyIfAdminIsAbleToLogOut() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password);
		adminuserpage = loginpage.clickOnSignInButton();
		logoutpage = loginpage.clickOnAdminButton().clickOnlogoutButton();
		boolean loginpageloginbutton = logoutpage.isLoginButtonDisplayed();
		assertTrue(loginpageloginbutton, Constants.LOGOUTMESSAGE);
	}
}
