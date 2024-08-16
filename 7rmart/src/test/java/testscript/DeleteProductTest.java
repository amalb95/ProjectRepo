package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.DeleteProductPage;
import utilities.ExcelUtility;

public class DeleteProductTest extends Base{
	
	@Test
	public void checkIfAlertIsDisplayedIfProductIsDeleted() throws IOException {
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		DeleteProductPage deleteproductpage = new DeleteProductPage(driver);
		deleteproductpage.enterUsernameOnUsernameField(username);
		deleteproductpage.enterPasswordOnPasswordField(password);
		deleteproductpage.clickOnSignInButton();
		deleteproductpage.clickOnManageProduct();
		deleteproductpage.clickOnDeleteButton();
		deleteproductpage.acceptDeleteAlert();
		boolean alert = deleteproductpage.isDeleteAlertDisplayed();
		assertTrue(alert,"The Product is not deleted");
	}
}
