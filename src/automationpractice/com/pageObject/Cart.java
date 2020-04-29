package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Utils;

public class Cart {
	
	private WebDriver driver;
	
	public Cart(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCartTab() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"Cart\")]/.."), 30);
	}
	
	public WebElement getCartEmpty() {
		return Utils.waitForElementPresence(driver, By.xpath("//p[@class=\"cart_block_no_products unvisible\"]"), 30);
	}
	
	public WebElement getCartProducts(int productNum) {
		return Utils.waitForElementPresence(driver, By.xpath("//dt[" + productNum + "]"), 30);
	}
	public WebElement getCartTotal() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[3]/span"), 30);
	} //
	
	//Cart Summery Total product value
	public WebElement getSummeryTotalProdValue() {
		return Utils.waitForElementPresence(driver, By.id("total_product"), 30);
	}
	
	// Get cart summery total values
	public WebElement getCartProductsTotal() {
		return Utils.waitForElementPresence(driver, By.id("total_price"), 30);
	}
	
	public WebElement proceedToCheckOutBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='center_column']/p[2]/a[1]"), 30);
	} // 
	
	public WebElement finalProceedToCheckOutBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='center_column']/form/p/button"), 30);
	}
	
	// Shipping locators
	public WebElement termsOfServiceCheckBox() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='cgv']"), 30);
	}
	
	public WebElement shippingProceedToCheckOutBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='form']/p/button"), 30);
	}
	
	//Cart Payment checkout payment methode 
	
	public WebElement paymentBankWire() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p"), 30);
	}
	
	public WebElement confirmedPaymentOrder() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='cart_navigation']/button"), 30);
	}
	
	
	public WebElement getCartTotalProduct() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[1]/span"), 30);
	}
	
	public WebElement getSuccessfullyAddedMessage() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"), 30);
	}
}
