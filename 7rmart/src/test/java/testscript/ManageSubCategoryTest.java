package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageSubCategoryPage;
import utilities.ExcelUtility;

public class ManageSubCategoryTest extends Base{
	
	@Test(description = "Verify if a user is able to change the status of a sub category")
	public void changeStatusofSubCategory() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		ManageSubCategoryPage managesubcategorypage = new ManageSubCategoryPage(driver);
		managesubcategorypage.enterUsernameInUsernameField(username);
		managesubcategorypage.enterPasswordInPasswordField(password);
		managesubcategorypage.clickOnSignInButton();
		managesubcategorypage.clickOnSubCategory();
		managesubcategorypage.clickOnStatus();
		boolean subcategoryalertdisplayed = managesubcategorypage.isSubCategoryStatusDisplayed();
		assertTrue(subcategoryalertdisplayed,"User is not able to change the status of sub category and alert is not displayed");
	}
	
	@Test(description = "Verify if user is able to add a new sub category")
	public void verifyIfAUserCanAddANewSubCategory() throws IOException  {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String subcategory = ExcelUtility.getStringData(1, 0, "ManageSubCategoryPage");
		ManageSubCategoryPage managesubcategorypage = new ManageSubCategoryPage(driver);
		managesubcategorypage.enterUsernameInUsernameField(username);
		managesubcategorypage.enterPasswordInPasswordField(password);
		managesubcategorypage.clickOnSignInButton();
		managesubcategorypage.clickOnSubCategory();
		managesubcategorypage.clickOnNewSubCategoryButton();
		managesubcategorypage.selectCategoryDropDown();
		managesubcategorypage.enterSubCategory(subcategory);
		managesubcategorypage.chooseImageForSubCategory();
		managesubcategorypage.clickOnSavebutton();
		boolean newsubcategoryalert = managesubcategorypage.isNewSubCategoryAlertDisplayed();
		assertTrue(newsubcategoryalert,"User is not able to add a new subcategory");
	}
}
