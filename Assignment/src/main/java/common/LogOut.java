package common;

import org.openqa.selenium.By;
import helpers.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class LogOut extends Helpers{
	
	AndroidDriver<AndroidElement>driver;
	
	public LogOut(AndroidDriver<AndroidElement> wd) {
		
		super(wd);
		//initialization
		this.driver=wd;
		
	}
	
	//PageFactory
	
	By Logout = By.xpath("//*[@text='Sign out']");
	By Signout = By.xpath("//*[@text='SIGN OUT']");
	
	public void logout() {
	
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign out\"))");
		waitForElementToAppearAndClick(Logout);
		waitForElementToAppearAndClick(Signout);
	}
	
}




