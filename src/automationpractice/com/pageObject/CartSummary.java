package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Utils;

public class CartSummary {
	
	private WebDriver driver;
	
	public CartSummary(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getCartSummTotalProductsPrice() {
		return Utils.waitForElementPresence(driver, By.id("total_product"), 30);
	}
	
	
	public WebElement getCartSummaryTotalPrice() {
		return Utils.waitForElementPresence(driver, By.id("total_price"), 30);
	}
	

	public WebElement getCartSummConfirmOrderBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//button[@type=\"submit\"]/span[contains(text(), \"I confirm my order\")]"), 30);
	}
	
	public WebElement getCartSummSuccessMsg() {
		return Utils.waitForElementPresence(driver, By.xpath("//p[contains(text(), \"Your order on My Store is complete.\")]"), 30);
	}
	
}
