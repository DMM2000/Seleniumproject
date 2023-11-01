import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

}
