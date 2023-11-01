package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameters;

public class Parent {
	
	
	      WebDriver driver;
	      @Parameters( {"browser"})

	      BeforeClass              // @BeforeTest                        //@BeforeMethod
	      public void Remove_Duplicate(String browser) {
	    	 if (browser.equals("Edge")) {
		  driver= new EdgeDriver();
		  driver.manage().window().maximize();}
	    	 
	    	 else if (browser.equals("FirefoxDriver")) {
	    		driver=new FirefoxDriver(); 
	    		driver.manage().window().maximize();}
	    	 
	    	 
	    		else{
	    		driver=new ChromeDriver();
	    		driver.manage().window().maximize();}
	    	 }
		
		
		@AfterTest                           //@AfterMethod
		public void after() {
		driver .quit();
	}
	

}
