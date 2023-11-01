import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		
		
	//	 WebDriver driver=  new EdgeDriver ();
		 WebDriver driver=  new ChromeDriver();
				
       driver.get("http://www.saucedemo.com");
       
       driver.manage().window().maximize();
       
       System.out.println(driver.getTitle());
		
	//	driver.quit();
		
		
	}

}
