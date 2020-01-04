package App.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Countobject extends baseclass{
	
	@FindBy(xpath="//a//img[@width='250']")
	private List<WebElement> image;
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement productcount;

	public Countobject() {
		PageFactory.initElements(driver, this);
	}
	
	public int count() {
		String value = productcount.getText();
		String [] v= value.split(" ");
		int total = Integer.parseInt(v[2]);
		
		return total;
		
	}
	public int image() {
		return image.size();
	}
	
}
	
	


