package TestNgClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.DriverManager;
import pageobjectModel.AlertPages;

public class AlertCases {
WebDriver driver;
	
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	DriverManager obj=new DriverManager();
	AlertPages objal;

	
  @Test(priority=1)
  public void alert() throws InterruptedException {
	  objal.alertClick();
	  objal.javascriptclick();
	  objal.scrollElement();
	  objal.buttonClick();

	 String ttr=objal. alertDismiss();
	 
	   if((ttr=="null")||(ttr.isEmpty()))
			  {
		  
		  Assert.assertTrue(true);
			  }
	  else
	  {
		  Assert.fail("String comparison failed ");
	  }
	 
  }
  @Test (priority=2)
  public void alert2() throws InterruptedException
  { 
	  objal.buttonClick();
	  
	  

	 String ttr2=objal.alertAccept();
  
	if(ttr2.contains("hello"))
	{
	  Assert.assertTrue(true);
		  
	  
  }
	else
	{
		Assert.fail("String comparison failed ");
	  }
	}
		
	
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objal=new AlertPages(driver);
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
