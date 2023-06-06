package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helpers.Helpers;



public class HomePage extends Helpers{
	
	WebDriver driver;
	
	public HomePage(WebDriver wd) {
		
		super(wd);
		this.driver=wd;
		
	}
	
	//PageFactory

	By name = By.xpath("//*[@text='Khan Academy']");
	By settings = By.xpath("//*[@class='android.widget.ImageView']");

	
	public void homePage() {
		
		waitForElementToAppear(name);
		waitForElementToAppearAndClick(settings);
		
	}

	
}
