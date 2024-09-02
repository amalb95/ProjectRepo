package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.FooterTextPage;
import utilities.ExcelUtility;

public class FooterTextTest extends Base{
	
	@Test (description = "Verify if user is able to edit the Footer Text in Manage Footer Text Page")
	public void verifyWhetherUserCanEditFooterText() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String address = ExcelUtility.getStringData(1, 0, "FooterTextPage");
		String email = ExcelUtility.getStringData(1, 1, "FooterTextPage");
		String phone = ExcelUtility.getIntegerData(1, 2, "FooterTextPage");
		FooterTextPage footertextpage = new FooterTextPage(driver);
		footertextpage.enterUsernameInUsernameField(username);
		footertextpage.enterPasswordInPasswordField(password);
		footertextpage.clickOnSignInButton();
		footertextpage.clickOnFooterText();
		footertextpage.clickOnEditButton();
		footertextpage.enterValueInAddressField(address);
		footertextpage.enterValueInEmailField(email);
		footertextpage.enterValueInPhoneNumberField(phone);
		footertextpage.clickOnUpdateButton();
		boolean footertextalert = footertextpage.footerTextAlert();
		assertTrue(footertextalert,"Footer Text cannot be edited");
	}
}
