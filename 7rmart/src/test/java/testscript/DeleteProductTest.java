package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.DeleteProductPage;

public class DeleteProductTest extends Base{
	
	@Test
	public void checkIfAlertIsDisplayedIfProductIsDeleted() {
		String username = "admin";
		String password = "admin";
		DeleteProductPage deleteproductpage = new DeleteProductPage(driver);
		deleteproductpage.enterUsernameOnUsernameField(username);
		deleteproductpage.enterPasswordOnPasswordField(password);
		deleteproductpage.clickOnSignInButton();
		deleteproductpage.clickOnManageProduct();
		deleteproductpage.clickOnDeleteButton();
		deleteproductpage.acceptDeleteAlert();
		boolean alert = deleteproductpage.isDeleteAlertDisplayed();
		assertTrue(alert,"");
	}
}
