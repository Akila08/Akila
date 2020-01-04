package App.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class emailobject1 extends baseclass{
	
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement Email;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Click;
	
	public emailobject1() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement setemail(String email)
	{
		setText(Email, email);
		return Email;
	}
	
	public void clickbutton() {
		Click.click();
	}

}
