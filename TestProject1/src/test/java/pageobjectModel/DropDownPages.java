package pageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPages {
	
WebDriver driver;
Homepages objhome;
	
	public DropDownPages(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		objhome=new Homepages(driver);
	}


	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[4]/a")
	public WebElement selectinput;
	
	@FindBy(id="single-input-field")
	public WebElement selectcolor;
	
	public void initialstep()
	{
		objhome.inputFormClick();
		selectinput.click();
	}
	public void dropDownHandling() throws InterruptedException
	{
		Select obj=new Select(selectcolor);
		obj.selectByIndex(1);
		Thread.sleep(3000);
		obj.selectByValue("Green");
		Thread.sleep(3000);
		obj.selectByVisibleText("Yellow");
		Thread.sleep(3000);
		obj.selectByIndex(0);
		Thread.sleep(3000);
	}

}
