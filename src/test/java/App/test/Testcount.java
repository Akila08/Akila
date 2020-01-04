package App.test;

import org.testng.annotations.Test;

import App.page.Countobject;
import App.page.Homepage;
import App.page.baseclass;

public class Testcount {
	
	Countobject a;
	baseclass bp;
	Homepage Hp;
	
	public Testcount() {
		
		a= new Countobject();
		bp= new baseclass();
		Hp= new Homepage();
	
		
	}
	@Test
	
	public void verifycountobj() {
		Hp.clickwomentab();
		System.out.println(a.image());
		System.out.println(a.count());
	}
	
	

}
