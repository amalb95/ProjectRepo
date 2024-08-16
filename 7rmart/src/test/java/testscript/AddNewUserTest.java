package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddNewUserPage;
import utilities.ExcelUtility;

public class AddNewUserTest extends Base{
	
	@Test
	public void checkifAdminCanAddANewUser() throws IOException {
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String newusername = "aj123";
		String newpassword = "password";
		AddNewUserPage addnewuserpage = new AddNewUserPage(driver);
		addnewuserpage.enterUsernameInUsernameField(username);
		addnewuserpage.enterPasswordInPasswordField(password);
		addnewuserpage.clickOnSignInButton();
		addnewuserpage.clickOnAdminUsers();
		addnewuserpage.clickOnNewButton();
		addnewuserpage.enterUsernameInAdminUserUsernameField(newusername);
		addnewuserpage.enterPasswordInAdminUserPasswordField(newpassword);
		addnewuserpage.selectUserTypeOfNewUser();
		addnewuserpage.clickOnSaveButton();
		boolean isnewusercreatedalert = addnewuserpage.isUserCreatedSuccessfullyAlertDisplayed();
		assertTrue(isnewusercreatedalert,"New User is not created and alert is not displayed");
	}
}
