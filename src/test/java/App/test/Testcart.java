package App.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import App.page.Cartobject;
import App.page.Cartobject2;
import App.page.Countobject;
import App.page.Homepage;
import App.page.baseclass;

public class Testcart {
	
	Cartobject a;
	Cartobject2 b;
	Homepage c;
	baseclass d;
	
	public Testcart() {
		
		a= new Cartobject();
		b= new Cartobject2();
		c= new Homepage();
		d=new baseclass();
	}
	
	@Test
	
	public void checkcart() {
		c.clickwomentab();
		a.clickproduct1();
		//System.out.println(b.cartText().getText());
		b.elementFound(b.clickcart());
		b.clickcart();
		
		
		Assert.assertTrue(b.verified().getText().contains("checkout"));

	}
	
}
	


 
