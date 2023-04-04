package TestNgClasses;

import org.testng.annotations.Test;

import Utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class UrlVerification {
WebDriver driver;
	
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	DriverManager obj=new DriverManager();

  @Test(priority=0)
  public void urlCheck() {
	  String s=driver.getCurrentUrl();
	  ///hardassert
	  Assert.assertEquals(expectedURL, s);
  System.out.println("sdkjasgdkjsgadjksgadkjgsakgdsakdjs");
	 
	  //softassert
	 // SoftAssert objassert = new SoftAssert();
	//  objassert.assertEquals(expectedURL, "jkljllk");
	//  System.out.println("sdkjasgdkjsgadjksgadkjgsakgdsakdjs");
	 // objassert.assertAll();
	  
//	    if(expectedURL.equals("hjdkakjdakjdga"))
//	    {
//	    	Assert.assertTrue(true);
//	    }else
//	    {
//	    	Assert.fail("String comparison failed for url verification");
//	    }
  }
  

  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	 obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
	  

	 
	  
	  
  }

}


