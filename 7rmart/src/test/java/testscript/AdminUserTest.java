package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base{
	
	@Test (description = "Verify if an existing user is able to add a new user in Admin Users Page")
	public void checkifAdminCanAddANewUser() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String newusername = "am123";
		String newpassword = "password";
		AdminUserPage adminuserpage = new AdminUserPage(driver);
		adminuserpage.enterUsernameInUsernameField(username);
		adminuserpage.enterPasswordInPasswordField(password);
		adminuserpage.clickOnSignInButton();
		adminuserpage.clickOnAdminUsers();
		adminuserpage.clickOnNewButton();
		adminuserpage.enterUsernameInAdminUserUsernameField(newusername);
		adminuserpage.enterPasswordInAdminUserPasswordField(newpassword);
		adminuserpage.selectUserTypeOfNewUser();
		adminuserpage.clickOnSaveButton();
		boolean isnewusercreatedalert = adminuserpage.isUserCreatedSuccessfullyAlertDisplayed();
		assertTrue(isnewusercreatedalert,"New User is not created and alert is not displayed");
	}
}
