package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageSubCategoryPage;
import utilities.ExcelUtility;

public class ManageSubCategoryTest extends Base {

	public AdminUserPage adminuserpage;
	public LoginPage loginpage;
	public LogoutPage logoutpage;
	public ManageSubCategoryPage managesubcategorypage;

	@Test(description = "Verify if a user is able to change the status of a sub category")
	public void changeStatusofSubCategory() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password);
		adminuserpage = loginpage.clickOnSignInButton();
		managesubcategorypage = loginpage.clickOnSubCategory();
		logoutpage = managesubcategorypage.clickOnStatus();
		boolean subcategoryalertdisplayed = managesubcategorypage.isStatusDisplayed();
		assertTrue(subcategoryalertdisplayed, Constants.SUBCATEGORYSTATUSMESSAGE);
	}

	@Test(description = "Verify if user is able to add a new sub category")
	public void verifyIfAUserCanAddANewSubCategory() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String subcategory = ExcelUtility.getStringData(1, 0, "ManageSubCategoryPage");
		loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password);
		adminuserpage = loginpage.clickOnSignInButton();
		managesubcategorypage = loginpage.clickOnSubCategory();
		logoutpage = managesubcategorypage.clickOnNewSubCategory().selectCategoryDropDown()
				.enterSubCategory(subcategory).chooseImageForSubCategory().clickOnSavebutton();
		boolean newsubcategoryalert = managesubcategorypage.isAlertDisplayed();
		assertTrue(newsubcategoryalert, Constants.NEWSUBCATEGORYMESSAGE);
	}
}