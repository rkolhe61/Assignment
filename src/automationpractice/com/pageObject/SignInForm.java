package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Utils;

public class SignInForm {
	
	private WebDriver driver;
	
	public SignInForm(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSignInForm() {
		return Utils.waitForElementPresence(driver, By.className("login"), 30);
	}
	
	public WebElement getSignInEmailField() {
		return Utils.waitForElementPresence(driver, By.id("email_create"), 30);
	}
	public WebElement getSignInEmailAddress() {
		return Utils.waitForElementPresence(driver, By.id("email"), 30);
	}
	
	public WebElement getSignInPasswordField() {
		return Utils.waitForElementPresence(driver, By.id("passwd"), 30);
	}
	//sf-with-ul
	public WebElement clickOnSignInBtn() {
		return Utils.waitForElementPresence(driver, By.id("SubmitLogin"), 30);
	}
	
	public WebElement clickOnWomanTab() {
		return Utils.waitForElementPresence(driver, By.className("sf-with-ul"), 30);
	}
	
	
	public WebElement getSignInBtn() {
		return Utils.waitForElementPresence(driver, By.id("SubmitCreate"), 30);
	}
	
	
	public void setEmailField(String mail) {
		WebElement email = this.getSignInEmailField();
		email.clear();
		email.sendKeys(mail);
	}
	
	public WebElement setCustTitle() {
		return Utils.waitForElementPresence(driver, By.id("id_gender1"), 30);
	}
	
	public WebElement setCustFirstName() {
		return Utils.waitForElementPresence(driver, By.id("customer_firstname"), 30);
	}
	
	public WebElement setCustLastName() {
		return Utils.waitForElementPresence(driver, By.id("customer_lastname"), 30);
	}
	
	public WebElement setCustPassword() {
		return Utils.waitForElementPresence(driver, By.id("passwd"), 30);
	}
	
	public Select selectCustBirthDay() {
		WebElement dayOfBirth = Utils.waitForElementPresence(driver, By.id("days"), 30);
		return new Select(dayOfBirth);
	}
	
	public Select selectCustCountry() {
		WebElement CustCountry = Utils.waitForElementPresence(driver, By.id("id_country"), 30);
		return new Select(CustCountry);
	}
	
	public Select selectCustomerDateOfBirthMonth() {
		WebElement monthOfBirth = Utils.waitForElementPresence(driver, By.id("months"), 30);
		return new Select(monthOfBirth);
	}
	
	public Select selectCustomerDateOfBirthYear() {
		WebElement yearOfBirth = Utils.waitForElementPresence(driver, By.id("years"), 30);
		return new Select(yearOfBirth);
	}
	
	public void selectCustomerDateOfBirthMonth(String month) {
		Select monthOfBirth = this.selectCustomerDateOfBirthMonth();
		monthOfBirth.selectByValue(month);
	}
	
	public WebElement setCustInfoFirstName() {
		return Utils.waitForElementPresence(driver, By.id("firstname"), 30);
	}
	
	public WebElement setCustInfoLastName() {
		return Utils.waitForElementPresence(driver, By.id("lastname"), 30);
	}
	
	public WebElement setCustInfoCompanyName() {
		return Utils.waitForElementPresence(driver, By.id("company"), 30);
	}
	
	public WebElement setCustAddressOne() {
		return Utils.waitForElementPresence(driver, By.id("address1"), 30);
	}
	
	public WebElement setCustAddressTwo() {
		return Utils.waitForElementPresence(driver, By.id("address2"), 30);
	}
	
	public WebElement setCustCity() {
		return Utils.waitForElementPresence(driver, By.id("city"), 30);
	}
	
	public WebElement setCustState() {
		return Utils.waitForElementPresence(driver, By.id("id_state"), 30);
	}
	
	public WebElement setCustPostCode() {
		return Utils.waitForElementPresence(driver, By.id("postcode"), 30);
	}
	
	public WebElement setCustCountry() {
		return Utils.waitForElementPresence(driver, By.id("uniform-id_country"), 30);
	}
	
	public WebElement setCustMobile() {
		return Utils.waitForElementPresence(driver, By.id("phone_mobile"), 30);
	}
	public WebElement setCustAliasAddress() {
		return Utils.waitForElementPresence(driver, By.id("alias"), 30);
	}
	
	public WebElement custRegisterButton() {
		return Utils.waitForElementPresence(driver, By.id("submitAccount"), 30);
	}
}
