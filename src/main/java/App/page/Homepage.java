package App.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends baseclass {
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement Women;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement Tshirts;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
		public WebElement womentab() {
			return Women;
		}
	
		
		public WebElement dressestab()
		{
			return Dresses;
		}
   
		public WebElement tshirttab() {
			return Tshirts;

		}
		
		public WebElement clickwomentab() {
			Women.click();
			return Women;
		}
	
		
		public WebElement clickdressestab()
		{
			Dresses.click();
			return Dresses;
		}
   
		public WebElement clicktshirttab() {
			Tshirts.click();
			return Tshirts;

		}
		
		
	

	
	

}
