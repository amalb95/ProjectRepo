package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.FooterTextPage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class FooterTextTest extends Base {
	public LoginPage loginpage;
	public FooterTextPage footertextpage;
	public ManageCategoryPage managecategorypage;
	public AdminUserPage adminuserpage;

	@Test(description = "Verify if user is able to edit the Footer Text in Manage Footer Text Page")
	public void verifyWhetherUserCanEditFooterText() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String address = ExcelUtility.getStringData(1, 0, "FooterTextPage");
		String email = ExcelUtility.getStringData(1, 1, "FooterTextPage");
		String phone = ExcelUtility.getIntegerData(1, 2, "FooterTextPage");
		loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password);
		adminuserpage = loginpage.clickOnSignInButton();
		footertextpage = loginpage.clickOnFooterText();
		footertextpage.clickOnEditButton().enterValueInAddressField(address).enterValueInEmailField(email)
				.enterValueInPhoneField(phone);
		managecategorypage = footertextpage.clickOnUpdateButton();
		boolean footertextalert = footertextpage.isAlertDisplayed();
		assertTrue(footertextalert, Constants.FOOTERTEXTMESSAGE);
	}
}
