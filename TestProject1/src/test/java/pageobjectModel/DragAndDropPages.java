package pageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtilities;

public class DragAndDropPages {

	WebDriver driver;
	PageUtilities objpage;
	
	public DragAndDropPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		objpage=new PageUtilities(driver);
	}
	
	@FindBy(xpath="//*[@id=\"fourth\"]/a")
	public WebElement from;
	
	@FindBy(xpath="//*[@id=\"amt7\"]/li")
	public WebElement to;
	
	
	public void actions() throws InterruptedException
	
	{
		objpage.dragAndDropActions(driver,from,to);
	}
	
	
	
	
	

}


//double click

//objactions.doubleClick(inputForm).build().perform();

//right click

//objactions.contextClick(inputForm).build().perform();

//double click

//objactions.doubleClick(inputForm).click().sendKeys("").build().perform();



