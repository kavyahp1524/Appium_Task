package helpers;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Helpers {

	WebDriver driver;
	
	public Helpers(WebDriver wd) {
		 
		this.driver=wd;
	}

	public void waitForElementToAppear(By findBy) {
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		
	}
	public void waitForElementToAppearAndClick(By findBy) {
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy)).click();
		
	}
	
	public static String deviceName;
	public static String platformName;
	public static String appPackage;
	public static String appActivity;
	public static String chromeDriver;
	
	
	public static void File(String deviceName,String platformName,String appPackage,String appActivity,String chromeDriver) throws IOException {
		
		//first FileIO second FileReader
		FileReader fr=new FileReader(System.getProperty("user.dir")
				+"//src//test//resources//config.properties");
		Properties p=new Properties();
		p.load(fr);
		deviceName  = p.getProperty("deviceName");
		platformName  = p.getProperty("platformName");
		appPackage  = p.getProperty("appPackage");
		appActivity  = p.getProperty("appActivity");
		chromeDriver = p.getProperty("chromeDriver");
	
	}
}









