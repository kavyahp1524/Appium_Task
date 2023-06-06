package screen;

import java.io.IOException;

import org.testng.annotations.Test;

import common.HomePage;
import common.LogOut;
import common.LoginPage;
import initializeSession.InitializeSession;

public class LoginAndLogoutTest extends InitializeSession{
		
	@Test(enabled=true)
	public void TradeIndia() throws InterruptedException, IOException{
       
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginApplication();
		
		HomePage home = new HomePage(driver);
		home.homePage();
		
		LogOut logout = new LogOut(driver);
		logout.logout();
		
	}
	
}
