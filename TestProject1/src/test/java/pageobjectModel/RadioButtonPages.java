package pageobjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtilities;

public class RadioButtonPages {
	WebDriver driver;
	PageUtilities objpage;
	
	
	public RadioButtonPages(WebDriver driver)
	{
		this.driver= driver;	
		PageFactory.initElements(driver, this);
		objpage=new PageUtilities(driver);
		
		
}
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[3]/a")
	public WebElement radiobuttonsdemo;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div[2]/label")
	public WebElement female ;
	
	
	@FindBy(id="button-one")
	public WebElement button;
	

	@FindBy(id="message-one")
	public WebElement message ;
	
	public void radioButtonClick() throws InterruptedException, IOException
	{
		objpage.click(radiobuttonsdemo);
		Thread.sleep(3000);
	}
	
	public void femaleRadioClick() throws InterruptedException
	{
		objpage.click(female);
	Thread.sleep(3000);
		
	}
	
	public void buttonClick() throws InterruptedException
	{
		objpage.click(button);
		Thread.sleep(1000);
	}
	public String getMessage()
	{
		return objpage.getTextValue(message);
	}
	
	

}
