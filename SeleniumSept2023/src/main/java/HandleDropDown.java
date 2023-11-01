import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();//video:50
		
		driver.get ("https://demo.automationtesting.in/Register.html");
		
	//	driver.navigate().to("http://google.com");
		
		driver.manage().window().maximize();
		
		 WebElement skills=driver.findElement(By.id("Skills"));//single select 
		 
		 Select sel= new Select(skills);
		 
		 
		 sel.selectByValue("Adobe Photoshop");
		 sel.selectByVisibleText("Art Design");		 
	     sel.selectByIndex(20);
	     
	     
	      driver.get("https://demoqa.com/select-menu");
	      WebElement cars=driver.findElement(By.name("cars"));
	      Select multi = new Select(cars); 
	      multi.selectByValue("audi");
	      multi.selectByIndex(0);
	      multi.selectByVisibleText("opel");
	      multi.deselectByVisibleText("opel");
	     
	      driver.quit();
		

	}

}
