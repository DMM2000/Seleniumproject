import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	private static final String JavascriptExecutor = null;
	private static final Object Careers = null;

	public static void main(String[] args) {                       
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new EdgeDriver();   /// video  :1.35:00
		
		driver.get("http://www.amazon.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text='Careers']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//
		
		js.executeScript("arguments[0]ScrollIntoView(true),Careers");
		//js.executeScript("Window.Scroll to 25,100");
		//js.executeScript("arguments[0].click()");
//		
	//	js.executeScript("arguments[0].value=arguments");
	//	js.executeScript("arguments[0].click()",Careers);
		
		
		

	}

	

	

}
