import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SingleClass {
	
	//Test executed in Alphabetically order, capital first
	
	// some Framework require to run without public void method//
	
// Test Next Generation is called TestNG//40:00after running REFRESH the project and 
//	will create new folder test-output emailable report html.right click and open in new browser.

	//another is Index
	//Public void InPrivateWindow(){	  // video: 36   //need to add @Test and  add to TestNG Library and Import also
	
	  @Test //If you do not write any priority it will execute first
	  
      public void InPrivateWindow() throws InterruptedException {
			
			EdgeOptions option=new EdgeOptions();
			
			option.addArguments("--in private");
			
			WebDriver driver= new EdgeDriver();
			
			driver.get("https://www.google.com");
			
			Thread .sleep(5000);
			
			driver.quit();
	  }

            @Test(priority=4)
	        public void  Navigation() {
		        	  
        	         	  
        	  WebDriver driver  = new ChromeDriver();//video day 4 (1.12.00)
      		driver.get("http://www.google.com");
      		driver.manage().window().maximize(); 
      		driver.navigate(). to("http://www.amazon.com");
      	//	driver.get("http://www.google.com");
      		driver.navigate().back();
      		driver.navigate().forward();
      		driver.navigate().refresh();
      		
      		
      		driver.quit();
      		
          }
            
            @Test(enabled=false)// will skip the test cause from executing
            
            public void abc(){
            	
            	
            	
            }
            
            @Test(priority=1)
    	  public void Xyz(){
    		  
    		  
    	  }
    	  
    	  
    	  
      }

