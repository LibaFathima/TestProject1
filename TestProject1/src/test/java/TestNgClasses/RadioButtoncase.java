package TestNgClasses;

import org.testng.annotations.Test;

import Utility.DriverManager;
import pageobjectModel.Homepages;
import pageobjectModel.RadioButtonPages;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RadioButtoncase {
	WebDriver driver;
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	Homepages objhome;
	RadioButtonPages objr;
	DriverManager obj=new DriverManager();
  @Test
  public void radioButton() throws InterruptedException, IOException {
	  objhome.inputFormClick();
	  objr.radioButtonClick();
	  objr.femaleRadioClick();
	  objr.buttonClick();
	  String s=objr.getMessage();
	  Assert.assertEquals(s, "Radio button 'Female' is checked");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException  {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objhome=new Homepages(driver);
	  objr=new RadioButtonPages(driver);
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
