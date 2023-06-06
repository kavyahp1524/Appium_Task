package common;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import helpers.*;


public class LoginPage extends Helpers{
	
	WebDriver driver;
	
	public LoginPage(WebDriver wd) {
		
		super(wd);
		//initialization
		this.driver=wd;
		PageFactory.initElements(driver, this);
	}
	
	
	//PageFactory

	By Mobilenumber = By.xpath("//*[@class='android.view.ViewGroup']");
	By google = By.xpath("//*[@text='Continue with Google']");
	By account = By.xpath("//*[@text='Kavyashree HP']");
	
	
	public void loginApplication() {
		
		
		waitForElementToAppear(Mobilenumber);
		waitForElementToAppearAndClick(google);
		waitForElementToAppearAndClick(account);
		
		
	}
		
}
