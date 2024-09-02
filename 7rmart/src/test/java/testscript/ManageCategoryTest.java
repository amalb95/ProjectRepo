package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base{

	@Test (description = "Verify if user is able to add a new category in Manage Category Page")
	public void verifyWhetherUserCanAddANewCategory() throws IOException, AWTException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String categoryname = ExcelUtility.getStringData(1, 0, "ManageCategoryPage");
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.enterUsernameInUsernameField(username);
		managecategorypage.enterPassowrdInPasswordField(password);
		managecategorypage.clickOnSignInbutton();
		managecategorypage.clickOnManageCategory();
		managecategorypage.clickOnNewCategory();
		managecategorypage.enterCategoryName(categoryname);
		managecategorypage.selectGroupofcategory();
		managecategorypage.selectCategoryImage();
		managecategorypage.showOnTopMenuSelect();
		managecategorypage.showOnTopMenuSelect();
		managecategorypage.clickOnSaveButton();
		boolean newcategoryAlert = managecategorypage.isNewCategoryAlertDisplayed();
		assertTrue(newcategoryAlert,"User is not able to add a new category");
	}
}
