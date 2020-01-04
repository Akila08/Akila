package App.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartobject extends baseclass{
		
	@FindBy(xpath="//a//img[@width='250']")
	private WebElement image;


    public Cartobject() {
	PageFactory.initElements(driver, this);
  }
    
    public WebElement product1() {
    	return image;
    }
    
    
    public WebElement clickproduct1() {
    	image.click();
    	return image;
    	
    }
}

