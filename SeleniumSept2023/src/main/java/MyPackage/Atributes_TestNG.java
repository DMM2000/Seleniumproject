package MyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Atributes_TestNG {    //1. invocationCount=4  2.timeOut=2000 3.description="This is high important" 4.dependsOnMethods= {"login"})
	                             // groups= Functional and non Functional groups
	
	
	
	@Test (invocationCount=4,timeOut=2000, groups={"Functional"})
	public void abc() 
	{
		
	}
		
	@Test(description="This is high important",groups={"non-Functional"})
	public void xyz() {
		
		
	}
	
	
	@Test(groups={"Functional"})
	public void  facebook_login() {}//first to execute because  the login comes before
	
	
	
	@Test (dependsOnMethods= {"login"})
	public void checkin () {
		
		
	}
	
	
	@Test(groups={"non-Functional"})
	
	public void Zebra() {}
	
	@Parameters({"username","password"})
	@Test(groups= {"Functional"})
	
	public void Login(String username,String password) {
		WebDriver driver=new EdgeDriver();
		
		driver.get ("http://www.saucedemo.com");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
}
