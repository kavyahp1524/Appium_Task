package createSession;


import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import helpers.Helpers;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability3 extends Helpers{
	
	WebDriver driver;
	
		public Capability3(WebDriver wd) {
		super(wd);
		this.driver=wd;
		}

	public static AndroidDriver<AndroidElement> capabilities() throws IOException, InterruptedException {
		
		File(deviceName, platformName, appPackage, appActivity, chromeDriver);
		
		DesiredCapabilities dc=new DesiredCapabilities();
		//general capability for mobile capability
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,appPackage);
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,appActivity);
        
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,chromeDriver);
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		//if i want to call capabilities in other class i ll use return driver
		return driver;
			
	}
}
