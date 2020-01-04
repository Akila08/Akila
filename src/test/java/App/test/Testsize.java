package App.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import App.page.Sizepage;
import App.page.baseclass;

public class Testsize {
			
		Sizepage Sp;
		baseclass bp;
		
		public Testsize() {
	    	
	    	Sp= new Sizepage();
	    	bp=new baseclass();
	    	}
		
		@Test
	    public void verfiytabs() {
	    	Sp.clickwomentab();
	    	Assert.assertTrue(Sp.getTitlte().contains("Women"));
		}
		
		@Test
	    public void verifysmall() {
	    	Assert.assertTrue(Sp.Smalltab().isDisplayed());
	    	}
	    
	    @Test
	    public void verifylarge() {
	       Assert.assertTrue(Sp.mediumtab().isDisplayed());
	    }
	    
	    @Test
	    public void verifytlarge() {
	    	Assert.assertTrue(Sp.largetab().isDisplayed());
	    }

}
