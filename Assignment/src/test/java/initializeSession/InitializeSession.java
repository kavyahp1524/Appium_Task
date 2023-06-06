package initializeSession;

import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import createSession.Capability3;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class InitializeSession{
	
	protected AndroidDriver<AndroidElement> driver;
       
		@BeforeSuite()
		public void initialization() throws IOException, InterruptedException {
			
			Capability3.capabilities();
			
		}
	
		@AfterSuite
		public void Quit() {
			driver.quit();
		}

}



