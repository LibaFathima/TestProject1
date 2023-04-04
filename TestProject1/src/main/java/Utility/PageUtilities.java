package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class PageUtilities {
	WebDriver driver; 
	Alert objalert;
	Actions objactions;
	Date currentdate;
	TakesScreenshot scrShot;
	
	
	public PageUtilities(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void scrolltoElement(WebElement element) {
	try
	{
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		
	}
}
	

public void click(WebElement element) {
	try {
	element.click();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		Assert.fail(e.getMessage());
		
	}
	
}

public String getTextValue(WebElement element) {
	try
	{
	element.getText();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		Assert.fail(e.getMessage());
	}
	return element.getText();
	
}

public void enterText(WebElement element,String value) {
	
	try {
	
	element.sendKeys(value);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		Assert.fail(e.getMessage());
	}
	
	
}


//Convert to switch
public  String alert(WebDriver driver,String actions,String value) 
{ String text=null;
try {
	 objalert = driver.switchTo().alert();
	switch(actions)
	{
	case "accept":
		 objalert.accept();
		 break;
	case "dismiss":
		objalert.dismiss();
		break;
	case "sendKeys":
		objalert.sendKeys(value);
		break;
	case "gettext":
		text=objalert.getText();
		
	default:
		System.out.println("invalid");
		
	}
}
catch(Exception e)
{
	e.printStackTrace();
	Assert.fail(e.getMessage());
}

	return text;
}
public String stepsFollow(WebElement element,String actions,String value)
{ String text=null;
try {
	switch(actions)
	{
	case "click":
		element.click();
		break;
		
	case "sendKeys":
		 element.sendKeys(value);
		 break;
		
	case "gettext":
     text=element.getText();
     break;
     
     default:
    	 System.out.println("Invalid");
    	 
	}
}
catch(Exception e)
{
	e.printStackTrace();
	Assert.fail(e.getMessage());
}
	return text;

	
		
		
	}
	//if(value.contains("accept"))	
	  //  objlaert.accept();
	
	//if(value.contains("dismiss"))
		//objlaert.dismiss();0

public void dragAndDropActions(WebDriver driver,WebElement from,WebElement to) throws InterruptedException
{
	try
	{
	objactions=new Actions(driver);
	 objactions.dragAndDrop(from,to).build().perform();
	Thread.sleep(3000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		Assert.fail(e.getMessage());
	}
	
	
}
	public void screenShot() throws IOException
	
	{ try
	{
		currentdate=new Date();
	
	String screenshotfile=currentdate.toString().replace(" ","-").replace(":","-");
	
	//System.out.println(screenshotfile);
	
		scrShot=((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\ROSE\\git\\TestProject\\TestProject\\src\\test\\resources\\screenshots"+screenshotfile+".png");
		
		FileUtils.copyFile(SrcFile, DestFile);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		Assert.fail(e.getMessage());
	}
	
	
	
	
	
		
	}
}




