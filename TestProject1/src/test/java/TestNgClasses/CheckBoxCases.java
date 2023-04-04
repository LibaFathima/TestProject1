package TestNgClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.DriverManager;
import pageobjectModel.CheckBoxPages;
import pageobjectModel.Homepages;

public class CheckBoxCases {
	WebDriver driver;
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	Homepages objhome;
	CheckBoxPages objcheck;
	
	
	DriverManager obj=new DriverManager();
  @Test
  public void checkBox() throws InterruptedException, IOException {
	  objhome.inputFormClick();
	  objcheck.checkDemoClick();
	  
	  objcheck.checkBoxClick();
	String s=  objcheck.getValue();
	if(s.contains("Check box is checked"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.fail("String comaprison failed");
	}
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objhome=new Homepages(driver);
	  objcheck=new CheckBoxPages(driver);
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
