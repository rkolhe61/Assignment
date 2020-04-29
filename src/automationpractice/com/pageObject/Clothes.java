package automationpractice.com.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Utils;

public class Clothes {
	
	private WebDriver driver;
	
	public Clothes(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getWomenBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]"), 30);
	}
	
	public WebElement getDressesBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]"), 30);
	}
	
	public WebElement getTShirtsBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]"), 30);
	}
	
	public WebElement getDressesDropDown() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul"), 30);
	}
	
	public WebElement getCasualDressesBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Casual Dresses\")]"), 30);
	}
	
	public WebElement getEveningDressesBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Evening Dresses\")]"), 30);
	}
	
	public WebElement getSummerDressesBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Summer Dresses\")]"), 30);
	}
	
	/**@param dressNum (value 1) */
	public WebElement getCasualDressProduct(int dressNum) {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);	
	}
	
	/**@param dressNum (value 1) */
	public WebElement getEveningDressProduct(int dressNum) {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);	
	}
	
	/**@param dressNum (values from 1 to 3) */
	public WebElement getSummerDressProduct(int dressNum) {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);	
	}
	
	public WebElement clickOnWomanLinkText() {
		return Utils.waitForElementPresence(driver, By.linkText("Printed Dress"), 30);
	}
	
	public WebElement clickOnAddQty() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='quantity_wanted_p']/a[2]/span"), 30);
	}  //
	
	public WebElement clickOnAddQty1() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='quantity_wanted']"), 30);
	}
	
	public WebElement addToCartButton() {
		return Utils.waitForElementPresence(driver, By.id("add_to_cart"), 30);
	}
	
	public WebElement proceedToCheckOut() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a"), 30);
	}
	
	public void hoverMouseOnLinkText(){
		Actions actions = new Actions(driver);
		WebElement option = driver.findElement(By.linkText("Printed Dress"));
	    actions.moveToElement(option).perform();;
	}
	
	public void hoverMouseOnQtyUp(){
		Actions actions = new Actions(driver);
		WebElement qtyUp = driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]"));
	    actions.moveToElement(qtyUp).perform();;
	}
	public WebElement quickView(){ 
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(@rel, 'id_product=3') and @class = 'quick-view']"),10);
	}
	public List<WebElement> getDressesCount() {
		return driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"));	
	}
}
