package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageSubCategoryPage;
import utilities.ExcelUtility;

public class ManageSubCategoryTest extends Base{
	
	@Test
	public void changeStatusofSubCategory() throws IOException {
		//String username = "admin";
		//String password = "admin";
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
}
