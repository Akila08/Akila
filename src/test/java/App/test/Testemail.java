package App.test;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import App.page.baseclass;
import App.page.emailobject1;
import App.page.emailobject2;

public class Testemail {
	
	emailobject1 a;
	emailobject2 b;
	baseclass bp;
	
	public Testemail() {
		
		a= new emailobject1();
		b= new emailobject2();
		bp= new baseclass();
	}
	
	
	int random= new Random().nextInt(4000);
	String email= "aki"+random+"yahoo@gmail.com";
	
	
	@Test
	public void verified() {
		a.setemail(email);
		a.clickbutton();
		Assert.assertTrue(b.verified().getText().contains("You have successfully subscribed to this newsletter"));
	}

}
