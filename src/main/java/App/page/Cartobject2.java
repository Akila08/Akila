package App.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartobject2 extends baseclass {

	@FindBy(xpath = "//*[@name='Submit']")
	private WebElement Addtocart;

	@FindBy(name = "Submit")
	private WebElement CartAdd;

	@FindBy(xpath = "//strong[@class='dark']")
	private WebElement verified;

	public Cartobject2() {
		PageFactory.initElements(driver, this);
	}

	public WebElement cart() {
		return Addtocart;
	}

	public WebElement verified() {
		return verified;
	}

	public WebElement clickcart() {
		CartAdd.click();
		return CartAdd;
	}

	public WebElement cartText() {
		return Addtocart;
	}
}
