package App.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sizepage extends baseclass{
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement Women;
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_1']")
	private WebElement Smallsize;
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_2']")
	private WebElement mediumsize;
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_3']")
	private WebElement largesize;
	
	public Sizepage() {
		PageFactory.initElements(driver, this);
	}
	
	    public WebElement clickwomentab() {
		Women.click();
		return Women;
	}
		public WebElement Smalltab() {
			return Smallsize;
		}
	
		
		public WebElement mediumtab()
		{
			return mediumsize;
		}
   
		public WebElement largetab() {
			return largesize;

		}
	
	

}
