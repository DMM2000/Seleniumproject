import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 WebDriver driver=  new EdgeDriver ();//opening web browsers
 //WebDriver driver = new SafariDriver();//

  driver.get("http://www.amazon.com");

 driver.manage().window().maximize();

System.out.println(driver.getTitle());
	

System.out.println(driver.getCurrentUrl());

driver.quit();  }}

