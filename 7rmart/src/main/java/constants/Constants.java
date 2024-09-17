package constants;

public class Constants {
	public static final String TESTDATAFILE = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx";
	public static final String SUBCATEGORYIMAGE = System.getProperty("user.dir")+"\\src\\test\\resources\\fridge.jpg";
	public static final String CATEGORYIMAGE = System.getProperty("user.dir")+"\\src\\test\\resources\\helmets.jpg";
	public static final String CONFIGFILE = System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
	public static final String LOGINVALIDMESSAGE = "Homepage is not loaded when user enters valid credentials";
	public static final String ADMINMESSAGE = "New User is not created and alert is not displayed";
	public static final String FOOTERTEXTMESSAGE = "Footer Text cannot be edited";
	public static final String LOGININVALIDUSERNAME = "Homepage is loaded when user enters invalid username and valid password";
	public static final String LOGININVALIDPASSWORD = "Homepage is loaded when user enters valid username and invalid password";
	public static final String LOGININVALIDMESSAGE = "Homepage is loaded when user enters invalid credentials";
	public static final String LOGOUTMESSAGE = "User is not able to logout from the webpage";
	public static final String MANAGECATEGORYMESSAGE = "User is not able to add a new category";
	public static final String MANAGECONTACTMESSAGE = "User is unable to update contact details";
	public static final String MANAGENEWSMESSAGE = "User is unable to enter a new news";
	public static final String MANAGEPRODUCTMESSAGE = "The Product is not deleted";
	public static final String NEWSUBCATEGORYMESSAGE = "User is not able to add a new subcategory";
	public static final String SUBCATEGORYSTATUSMESSAGE = "User is not able to change the status of sub category and alert is not displayed";
}
