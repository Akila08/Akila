package App.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class emailobject2 extends baseclass{
	
	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement verified;
	
    public emailobject2() {
    	PageFactory.initElements(driver, this);
    }
    
    public WebElement verified() {
    	return verified;
    }

	

}
