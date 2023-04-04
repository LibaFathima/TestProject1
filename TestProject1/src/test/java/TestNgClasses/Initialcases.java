package TestNgClasses;

import org.testng.annotations.Test;

import Utility.DriverManager;
import Utility.ExcelUtility;
import pageobjectModel.Homepages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Initialcases {
WebDriver driver;
	
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	DriverManager obj=new DriverManager();
	Homepages objHome ;

  @Test(priority=0,enabled=true)
  public void valueCheck1() throws InterruptedException, IOException {
	//pageobject model with PageFactory	  
	  
	  objHome.messageverification();
	  String appvaluue = objHome.returntextvalue();
	  
	  
//pageobject model without PageFactory	  
//	  WebElement inputForm=driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
//	  inputForm.click();
//	  Thread.sleep(2000);
//	  WebElement textbox=driver.findElement(By.id("single-input-field"));
//	  textbox.sendKeys("Hello");
//	  Thread.sleep(2000);
//	  WebElement button=driver.findElement(By.id("button-one"));
//	  button.click();
//	  Thread.sleep(2000);
//	  WebElement getvalue=driver.findElement(By.id("message-one"));
//	 String appvaluue= getvalue.getText();  
	  
	
	 Assert.assertEquals(appvaluue, "Your Message : " + ExcelUtility.readIntData(0, 1));
  }
	 @Test(priority=1,enabled=false)
	 public void valueCheck2() throws InterruptedException
	 { 
		 
		 objHome.additionSteps();
		 String appvaluue1=objHome.returnGetValue();
		
		
		  
		 Assert.assertEquals(appvaluue1, "50");
	 
  
	 }

@BeforeTest
  public void beforeTest() throws InterruptedException {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objHome=new Homepages(driver);
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
