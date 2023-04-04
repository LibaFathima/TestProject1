package TestNgClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.DriverManager;
import pageobjectModel.DropDownPages;

public class DropDownCases {
WebDriver driver;
	
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	DriverManager obj=new DriverManager();
	DropDownPages objDropdown;
	
  @Test
  public void dropDown() throws InterruptedException {
	  objDropdown.initialstep();
	  objDropdown.dropDownHandling();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objDropdown=new DropDownPages(driver);
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}