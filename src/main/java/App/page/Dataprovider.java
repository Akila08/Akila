package App.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	public WebDriver driver;
	
	@BeforeMethod
	public void lanch() {
		System.setProperty("webdriver.chrome.driver","E:\\chrome79\\chromedriver.exe" );
		 driver= new ChromeDriver();
		 driver.get("https://www.adactin.com/HotelApp/");	
		 }
	
			@DataProvider (name="verifylogin")
		    public Object [] [] getdata(){
			Object[][] data= new Object [3][2];
			
			data[0][0]= "Admin";
			data[0][1]= "admin123";	
			
			
			data[1][0]= "Akila";
			data[1][1]="akila123";
			
			
			data[2][0]= "hello";
			data[2][1]="hello123";
			
			return data;
		}
		
		@Test(dataProvider="verifylogin")
		
		public void verifylogin(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();
		
		             
		}
	}