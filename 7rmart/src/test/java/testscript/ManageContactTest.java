package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base{
	
	@Test (description = "Verify if user can update the contact details")
	public void verifyIfUserCanUpdateContactDetails() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String phonenumber = ExcelUtility.getIntegerData(1, 0, "ManageContactPage");
		String email = ExcelUtility.getStringData(1, 1, "ManageContactPage");
		String address = ExcelUtility.getStringData(1, 2, "ManageContactPage");
		String deliverytime = ExcelUtility.getIntegerData(1, 3, "ManageContactPage");
		String deliverychargelimit = ExcelUtility.getStringData(1, 4, "ManageContactPage");
		ManageContactPage managecontactpage = new ManageContactPage(driver);
		managecontactpage.enterUsernameInUsernameField(username);
		managecontactpage.enterPassowrdInPasswordField(password);
		managecontactpage.clickOnSignInbutton();
		managecontactpage.clickOnManageContact();
		managecontactpage.clickOnEditContactButton();
		managecontactpage.enterPhoneNumber(phonenumber);
		managecontactpage.enterEmail(email);
		managecontactpage.enterAddress(address);
		managecontactpage.enterDeliveryTime(deliverytime);
		managecontactpage.enterDeliveryChargeLimit(deliverychargelimit);
		managecontactpage.clickOnUpdateButton();
		boolean contactupdatealert = managecontactpage.isContactUpdateAlertDisplayed();
		assertTrue(contactupdatealert,"User is unable to update contact details");
	}
}