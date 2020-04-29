package automationpractice.com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationpractice.com.pageObject.Account;
import automationpractice.com.pageObject.SignInForm;


public class CreateAccount {

	private WebDriver driver;
	private SignInForm signin;
	private Account account;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		signin = new SignInForm(driver);
		account = new Account(driver);

		String baseUrl = "http://automationpractice.com/index.php";
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@AfterClass
	public void closeAll() {
		account.getAccountLogout().click();
		driver.quit();
	}

	@Test(priority = 1)
	public void signInPage() {
		signin.getSignInForm().click();
		signin.getSignInEmailField().sendKeys("rkolhe@gmail.com");
		signin.getSignInBtn().click();	
		signin.setCustTitle().click();
		
		signin.setCustFirstName().sendKeys("ravindra");
		signin.setCustLastName().sendKeys("kolhe");
		signin.setCustPassword().sendKeys("requiredJob");
		
		signin.selectCustBirthDay().selectByValue("12");
	
		signin.selectCustomerDateOfBirthMonth("June");
		signin.selectCustomerDateOfBirthYear().selectByValue("1991");
		signin.setCustInfoFirstName().sendKeys("Ravindra");
		signin.setCustInfoLastName().sendKeys("kolhe");
		signin.setCustInfoCompanyName().sendKeys("PTC SOFTWARE");
		signin.setCustAddressOne().sendKeys(" drest, ajkah, jajh");
		signin.setCustAddressTwo().sendKeys("Bavdhan, pune");
		signin.setCustCity().sendKeys("Pune");
	
		signin.setCustPostCode().sendKeys("41102");
		signin.selectCustCountry().selectByValue("United States");
		signin.setCustMobile().sendKeys("+17845127845");
		signin.setCustAliasAddress().sendKeys("8 Boston WI 53150"); 
		signin.custRegisterButton().click();
	}

}
