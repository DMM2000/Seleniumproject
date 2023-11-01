package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_More extend Parent(){
	
	
	WebDriver driver;

	// @BeforeTest                        //@BeforeMethod
	//public void Remove_Duplicate() {
	//	driver= new EdgeDriver();
		
		
	//}
	//	@AfterTest                           //@AfterMethod
	//	public void after() {
	//	driver .quit();
	}
	
	
	
	 @Test
     public void InPrivateWindow() throws InterruptedException {
	
		 EdgeOptions option=new EdgeOptions();
			
	option.addArguments("--in private");
	
	WebDriver driver= new EdgeDriver();
	
	driver.get("https://www.google.com");
	
	Thread .sleep(5000);
	
	//driver.quit();
	 } 
	
     @Test
     public void booleanOperations() {
	 
     driver.get("https://demo.automationtesting.in/Register.html");
  
     driver.manage().window().maximize();
  
	boolean x= driver. findElement(By.id("checkbox1")).isSelected();
	
	System.out.println("is Selected:"+ x);
	
	boolean y= driver.findElement(By.id("checkbox1")).isDisplayed();
	
	System.out.println("isDisplayed:"+ y);
	
	boolean z=driver.findElement(By.id("checkbox1")).isEnabled();
	
	System.out.println("is Enabled:"+ z);
	 
	
    // driver .quit();
	}
	 
	 

}
