package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	public LoginPage loginpage;
	public AdminUserPage adminuserpage;
	public ManageCategoryPage managecategorypage;
	public ManageContactPage managecontactpage;

	@Test(description = "Verify if user is able to add a new category in Manage Category Page")
	public void verifyIfUserCanAddNewCategory() throws IOException, AWTException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String categoryname = ExcelUtility.getStringData(1, 0, "ManageCategoryPage");
		loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password);
		adminuserpage = loginpage.clickOnSignInButton();
		managecategorypage = loginpage.clickOnManageCategory();
		managecategorypage.clickOnNewCategory().enterCategoryName(categoryname).selectGroupofcategory()
				.selectCategoryImage().showOnTopMenuSelect().showOnTopMenuSelect();
		managecontactpage = managecategorypage.clickOnSaveButton();
		boolean newcategoryAlert = managecategorypage.isNewCategoryAlertDisplayed();
		assertTrue(newcategoryAlert, Constants.MANAGECATEGORYMESSAGE);
	}
}
