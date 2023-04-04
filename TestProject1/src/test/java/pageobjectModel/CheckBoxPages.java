package pageobjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtilities;

public class CheckBoxPages {
	

	WebDriver driver;
	PageUtilities objpage;
	
	
	public CheckBoxPages(WebDriver driver)
	{
		this.driver= driver;
		
		
		PageFactory.initElements(driver, this);
		objpage=new PageUtilities(driver);
		
		
	}
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[2]/a")
	public WebElement checkboxdemo;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/label")
	public WebElement checkboxclick;
	
	
	@FindBy(id="message-one")
	public WebElement getvalue;
	
	public void checkDemoClick() throws InterruptedException, IOException
	{
		objpage.click(checkboxdemo);
		objpage.screenShot();
		Thread.sleep(3000);
	}
	
	public void checkBoxClick() throws InterruptedException
	{
		objpage.click(checkboxclick);
		Thread.sleep(3000);
		
	}
	public String getValue()
	{
		
		 return objpage.getTextValue(getvalue);
		
	}
	

}






