package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageProductPage;
import utilities.ExcelUtility;

public class ManageProductTest extends Base{
	
	@Test(description = "Verify if User is able to delete a product from Manage product page")
	public void checkIfAlertIsDisplayedIfProductIsDeleted() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		ManageProductPage manageproduct = new ManageProductPage(driver);
		manageproduct.enterUsernameOnUsernameField(username);
		manageproduct.enterPasswordOnPasswordField(password);
		manageproduct.clickOnSignInButton();
		manageproduct.clickOnManageProduct();
		manageproduct.clickOnDeleteButton();
		manageproduct.acceptDeleteAlert();
		boolean alert = manageproduct.isDeleteAlertDisplayed();
		assertTrue(alert,"The Product is not deleted");
	}
}
