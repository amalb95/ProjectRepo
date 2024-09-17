package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageContactPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	public AdminUserPage adminuserpage;
	public LoginPage loginpage;
	public ManageContactPage managecontactpage;
	public ManageNewsPage managenewspage;

	@Test(description = "Verify if user can update the contact details")
	public void verifyIfUserCanUpdateContactDetails() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String phonenumber = ExcelUtility.getIntegerData(1, 0, "ManageContactPage");
		String email = ExcelUtility.getStringData(1, 1, "ManageContactPage");
		String address = ExcelUtility.getStringData(1, 2, "ManageContactPage");
		String deliverytime = ExcelUtility.getIntegerData(1, 3, "ManageContactPage");
		String deliverychargelimit = ExcelUtility.getStringData(1, 4, "ManageContactPage");
		loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password);
		adminuserpage = loginpage.clickOnSignInButton();
		managecontactpage = loginpage.clickOnManageContact();
		managecontactpage.clickOnEditContact().enterPhoneNumber(phonenumber).enterEmail(email).enterAddress(address)
				.enterDeliveryTime(deliverytime).enterDeliveryChargeLimit(deliverychargelimit);
		managenewspage = managecontactpage.clickOnUpdateButton();
		boolean contactupdatealert = managecontactpage.isAlertDisplayed();
		assertTrue(contactupdatealert, Constants.MANAGECONTACTMESSAGE);
	}
}