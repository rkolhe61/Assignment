package automationpractice.com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationpractice.com.pageObject.Account;
import automationpractice.com.pageObject.Cart;
import automationpractice.com.pageObject.CartSummary;
import automationpractice.com.pageObject.Clothes;
import automationpractice.com.pageObject.SignInForm;

public class LoginWithNewCred {

	private WebDriver driver;
	private SignInForm signin;
	private Account account;
	private Clothes clothes;
	private Cart cart;
	private CartSummary summary;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		signin = new SignInForm(driver);
		account = new Account(driver);
		clothes = new Clothes(driver);
		cart = new Cart(driver);
		summary = new CartSummary(driver);

		String baseUrl = "http://automationpractice.com/index.php?controller=authentication";
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@AfterClass
	public void closeAll() {
		account.getAccountLogout().click();
		driver.quit();
	}

	@Test(priority = 1)
	public void loginWithNewUser() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		signin.getSignInEmailAddress().sendKeys("rkolhe@gmail.com");
		signin.getSignInPasswordField().sendKeys("requiredJob");
		signin.clickOnSignInBtn().click();
		signin.clickOnWomanTab().click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);		
		clothes.hoverMouseOnLinkText();
	    clothes.quickView().click();
	    Thread.sleep(5000);
	    driver.switchTo().frame(0);
		clothes.clickOnAddQty().click();
		clothes.addToCartButton().click(); 
		
		String productTotal = cart.getCartTotalProduct().getText();
		String cartTotal = cart.getCartTotal().getText() ;
		clothes.proceedToCheckOut().click();	
		String summeryProdcutTotal = cart.getSummeryTotalProdValue().getText();
		String summeryTotalPrice = cart.getCartProductsTotal().getText();
		Assert.assertEquals(summeryProdcutTotal, productTotal);
		Assert.assertEquals(summeryTotalPrice, cartTotal);
		cart.proceedToCheckOutBtn().click();
		cart.finalProceedToCheckOutBtn().click();
		cart.termsOfServiceCheckBox().click();
		cart.shippingProceedToCheckOutBtn().click();
		cart.paymentBankWire().click();
		cart.confirmedPaymentOrder().click();
	}
	@Test(priority = 2)
	public void confirmOrder() {
		summary.getCartSummConfirmOrderBtn().click();

		Assert.assertTrue(summary.getCartSummSuccessMsg().isDisplayed());
		Assert.assertEquals(summary.getCartSummSuccessMsg().getText(), "Your order on My Store is complete.");
	}

	@Test(priority = 3)
	public void checkIsOrderVisibleInOrderHistorySection() {
		account.getAccountBtn().click();
		Assert.assertTrue(account.getAccountOrderHistoryBtn().isDisplayed());
		account.getAccountOrderHistoryBtn().click();
		Assert.assertTrue(account.getAccountOrderListTable().isDisplayed());
		account.getAccountBtn().click();
		account.getAccountOrderHistoryBtn().click();
		Assert.assertEquals(account.getAccountOrdersLis().size(), 1);
	}
	
}
