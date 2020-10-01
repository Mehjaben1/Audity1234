import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fluent_Implicit {
  
  
  
  public String MercuryURL = "http://demo.guru99.com/test/newtours/";
	
	// Instantiate of the object
	public WebDriver driver;		
	
	public String WebBrowserKey ="webdriver.chrome.driver";
	 
	public String WebBrwoserKeyValue ="C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe";
	
	@BeforeTest
	
public void NavigateURL() {		
		
		
		
		// Set system property for chrome browser		
		System.setProperty(WebBrowserKey, WebBrwoserKeyValue);				
			
		 driver = new ChromeDriver();
		
		
		// Navigate to the specified URL
		driver.get(MercuryURL);
				
		// Implicit Wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		// Maximize the web browser
		driver.manage().window().maximize();
  
  
  
  
  
  }
}
