package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageProductPage;
import pages.ManageSubCategoryPage;
import utilities.ExcelUtility;

public class ManageProductTest extends Base {

	public AdminUserPage adminuserpage;
	public LoginPage loginpage;
	public ManageProductPage manageproductpage;
	public ManageSubCategoryPage managesubcategorypage;

	@Test(description = "Verify if User is able to delete a product from Manage product page")
	public void checkIfProductIsDeleted() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password);
		adminuserpage = loginpage.clickOnSignInButton();
		manageproductpage = loginpage.clickOnManageProduct();
		managesubcategorypage = manageproductpage.clickOnDeleteButton().acceptDeleteAlert();
		boolean alert = manageproductpage.isDeleteAlertDisplayed();
		assertTrue(alert, Constants.MANAGEPRODUCTMESSAGE);
	}
}