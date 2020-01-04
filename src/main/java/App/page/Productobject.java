package App.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productobject extends baseclass{
	
	@FindBy(xpath="(//*[@type='button'])[1]")
	private WebElement tweetdisplay;
	
	@FindBy(xpath="(//*[@type='button'])[2]")
	private WebElement sharedisplay;

	public Productobject() {
		PageFactory.initElements(driver, this);
	  }
	
	public WebElement tweet(){
		return tweetdisplay;
	}
		
		public WebElement share() {
			return sharedisplay;
		}
		
	}


