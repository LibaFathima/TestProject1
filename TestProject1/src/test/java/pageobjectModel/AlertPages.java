package pageobjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtilities;

public class AlertPages {
	WebDriver driver;
	PageUtilities objpage;
	

	
	public AlertPages(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		objpage=new PageUtilities(driver);
	

		
	}
	@FindBy(id="alert-modal")
	public WebElement alertsandmodels;
	
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[5]/a")
	public WebElement javascriptalert;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[3]/div/div[2]/button")
	public WebElement buttonalert;
	
		
	@FindBy(id="prompt-demo")
	public WebElement message;
	

	
	public void alertClick() throws InterruptedException
	{    objpage.stepsFollow(alertsandmodels,"click","");
		//objpage.click(alertsandmodels);
		Thread.sleep(3000);
	
	}
	
	public void javascriptclick() throws InterruptedException
	{
		objpage.stepsFollow(javascriptalert,"click","");
		//objpage.click(javascriptalert);
		Thread.sleep(3000);
	}
	
	public void scrollElement() throws InterruptedException
	{

	objpage.scrolltoElement(buttonalert);
	Thread.sleep(3000);
	
	}	
	
	public void buttonClick() throws InterruptedException
	{  objpage.stepsFollow(buttonalert,"click","");
		//objpage.click(buttonalert);
		Thread.sleep(3000);
	}
	
	public String alertDismiss() throws InterruptedException
	{
		//objpage.click(buttonalert);
		
	//	Alert objalert=driver.switchTo().alert();
	//	objalert.sendKeys("hpou");
	//	Thread.sleep(1000);
	//	objalert.dismiss();
	//	Thread.sleep(2000);
	//	return message.getText();
		
		objpage.alert(driver,"dismiss","");
		
		return message.getText();
		
	}
	
		
	
	public String alertAccept() throws InterruptedException
	{
		//buttonalert.click();
		
	Alert objalert=driver.switchTo().alert();
		objalert.sendKeys("hello");
		Thread.sleep(1000);
		objalert.accept();
		Thread.sleep(2000);
		return message.getText();
		
		
		
	}

}
