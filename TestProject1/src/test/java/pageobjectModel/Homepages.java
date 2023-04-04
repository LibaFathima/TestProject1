package pageobjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ExcelUtility;
import Utility.PageUtilities;

public class Homepages {
	WebDriver driver;
	PageUtilities objpage;
	
	public Homepages(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		objpage=new PageUtilities(driver);
	}
	

	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a")
	public WebElement inputform;
	
	@FindBy(id="single-input-field")
	public WebElement textbox;
	
	@FindBy(id="button-one")
	public WebElement button;
	
	
	@FindBy(id="message-one")
	public WebElement getvalue;
	
	@FindBy(id="value-a")
	public WebElement textbox1;
	
	@FindBy(id="value-b")
	public WebElement textbox2;
	
	@FindBy(id="button-two")
	public WebElement button1;
	
	@FindBy(id="message-two")
	public WebElement getvalue1;
	
	public void inputFormClick()
	{
		inputform.click();
	}
	
	
	
	public void messageverification() throws IOException {
		
		inputform.click();
		textbox.sendKeys(ExcelUtility.readIntData(0, 1));
		objpage.screenShot();
		button.click();
		
	}
	
	public void additionSteps()
	{
		
		textbox1.sendKeys("25");
		textbox2.sendKeys("25");
		button1.click();
	}
	
	public String returntextvalue() {
		return getvalue.getText();
		
	}
	public String returnGetValue() {
		return getvalue1.getText();
	}

	
	

}
