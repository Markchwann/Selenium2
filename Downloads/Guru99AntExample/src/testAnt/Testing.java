package testAnt;

import org.openqa.selenium.Alert;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	

public class Testing {
	
	
	WebDriver driver = new FirefoxDriver();
	
	@Test(priority=1)
	public void Login() 
	{
		//Launching the site
		driver.get("http://demo.guru99.com/V4/");
		
		//Login to Guru99
		driver.findElement(By.name("uid")).sendKeys("mngr34926");
		driver.findElement(By.name("password")).sendKeys("amUpenu");							
	    driver.findElement(By.name("btnLogin")).click();					
	    //Verifying the manager home page		
	    Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage" );	
	}
	
	@Test(priority=2)
	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
	}
	
	@Test(priority=3) 
	public void Logout()
	{
		 driver.findElement(By.linkText("Log out")).click();					
	        Alert alert=driver.switchTo().alert();			
	        alert.accept();		
	        //Verifying the title of the logout page		
	        Assert.assertEquals(driver.getTitle(),"Guru99 Bank Home Page" );
	}
	

}
