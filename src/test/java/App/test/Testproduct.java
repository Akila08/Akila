package App.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import App.page.Cartobject;
import App.page.Homepage;
import App.page.Productobject;
import App.page.baseclass;

public class Testproduct {
	
	baseclass bp;
	Productobject a;
    Cartobject b;
	Homepage c;
	
	public Testproduct() {
		
		bp= new baseclass();
		a= new Productobject();
		b= new Cartobject();
		c= new Homepage();
		
	}
	
	@Test
	
	public void checkproduct() {
		c.clickwomentab();
		b.clickproduct1();
		Assert.assertTrue(a.tweet().isDisplayed());
		Assert.assertTrue(a.share().isDisplayed());
		
	}

}
