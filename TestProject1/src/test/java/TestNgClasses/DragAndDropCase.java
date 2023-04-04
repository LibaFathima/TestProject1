package TestNgClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.DriverManager;
import pageobjectModel.DragAndDropPages;

public class DragAndDropCase {
	WebDriver driver;
	String expectedURL="https://demo.guru99.com/test/drag_drop.html";
	DriverManager obj=new DriverManager();
	DragAndDropPages objdrag;
	
	
  @Test
  public void dragAndDrop() throws InterruptedException {
	  objdrag.actions();
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objdrag=new DragAndDropPages(driver);  
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
