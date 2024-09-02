package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void javaScriptClick(WebDriver  driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	public void javaScriptScrollToAnElement(WebDriver  driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void clickOnAnElement(WebElement element) {
		element.click();
	}
	
	public void clearATextField(WebElement element) {
		element.clear();
	}
	
	public void enterValueIntoElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public String getTextFromAlert(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	
	public void enterValueIntoAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public boolean isAnElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public boolean isAnElementSelected(WebElement element) {
		return element.isSelected();
	}
	
	public boolean isAnElementEnabled(WebElement element) {
		return element.isEnabled();
	}
	
	public void selectDropDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void selectDropDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectDropDownByVisibleText(WebElement element, String visibletext) {
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}
	
	public String getTheURLOfCurrentWebPage(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public String getTheTitleOfCurrentWebPage(WebDriver driver) {
		return driver.getTitle();
	}
	
	public String getThePageSourceOfCurrentWebPage(WebDriver driver) {
		return driver.getPageSource();
	}
	
	public void navigateToPreviousWebPage(WebDriver driver) {
		driver.navigate().back();
	}
	
	public void navigatetoNextWebpage(WebDriver driver) {
		driver.navigate().forward();
	}
	
	public void refreshTheCurrentWebPage(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public void navigateToAWebPage(WebDriver driver, String url) {
		driver.navigate().to(url);
	}
	
	public String getTextFromWebElement(WebElement element) {
		return element.getText();
	}
	
	public String getAttributefromWebElement(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}
	
	public String getTagNameofWebElement(WebElement element) {
		return element.getTagName();
	}
	
	public void moveToAnElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public void doubleClickOnAnElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}
	
	public void rightClickOnAnElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}
	
	public void dragAndDropAnElement(WebDriver driver, WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
	}
	
	public void switchToAnIFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
}