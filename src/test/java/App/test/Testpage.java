package App.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import App.page.Homepage;
import App.page.baseclass;

public class Testpage {
	
	Homepage Hp;
	baseclass bp;

    public Testpage() {
    	
    	Hp= new Homepage();
    	bp=new baseclass();
    	}
    
    @Test
    
    public void verifywomen() {
    	Assert.assertTrue(Hp.womentab().isDisplayed());
    	}
    
    @Test
    public void verifydresses() {
       Assert.assertTrue(Hp.dressestab().isDisplayed());
    }
    
    @Test
    public void verifytshirt() {
    	Assert.assertTrue(Hp.tshirttab().isDisplayed());
    }
    
    @Test
    public void verfiytabs() {
    	Hp.clickwomentab();
    	Assert.assertTrue(Hp.getTitlte().contains("Women"));

    	
    	Hp.clickdressestab();
    	Assert.assertTrue(Hp.getTitlte().contains("Dresses"));

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	Hp.clicktshirttab();
    	Assert.assertTrue(Hp.getTitlte().contains("T-shirts"));
    }

}  

    
    
    
       
    	
    
