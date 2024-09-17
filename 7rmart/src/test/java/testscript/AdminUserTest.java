package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.FooterTextPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {

	public LoginPage loginpage;
	public AdminUserPage adminuserpage;
	public FooterTextPage footertextpage;

	@Test(description = "Verify if an existing user is able to add a new user in Admin Users Page")
	public void checkifAdminCanAddANewUser() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String newusername = "amd1235";
		String newpassword = "password";
		loginpage = new LoginPage(driver);
		adminuserpage = loginpage.enterUsername(username).enterPassword(password).clickOnSignInButton();
		footertextpage = adminuserpage.clickOnAdminUsers().clickOnNewButton().enterUsernameInUsernameField(newusername)
				.enterPasswordInPasswordField(newpassword).selectTypeOfNewUser().clickOnSaveButton();
		boolean isnewusercreatedalert = adminuserpage.isAlertDisplayed();
		assertTrue(isnewusercreatedalert, Constants.ADMINMESSAGE);
	}
}
