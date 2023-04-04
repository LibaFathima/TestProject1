package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
public WebDriver driver;

	
	public void closeBrowser()
	{
		driver.close();
		  
	}
	public void launchBrowser(String url,String browser) throws InterruptedException {
		// TODO Auto-generated method stub
  if(browser.equals("chrome"))
  {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSE\\git\\TestProject\\TestProject\\src\\main\\resources\\chromedriver.exe");
		  ChromeOptions onarg=new ChromeOptions();
		  onarg.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(onarg);
		  	driver.manage().window().maximize();
		  	driver.get(url); 
		  	Thread.sleep(4000);
		  
		
	}
		if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ROSE\\git\\TestProject\\TestProject\\src\\main\\resources\\geckodriver.exe" );
			 driver=new FirefoxDriver();
			driver.manage().window().maximize();
		    driver.get(url);
	       
		}

	
	}
}



