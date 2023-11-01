import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();//to
		
		driver.get ("http://www.saucedemo.com");
		
	//	driver.navigate().to("http://google.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By. id ("user-name")).sendKeys("Deepa");
		
	//	driver.findElement(By.name("user-name"));//.sendKeys("secret_sauce");
		
	     driver.findElement(By.id("password")).sendKeys("dancing");
	     
	     driver.findElement(By.className("btn_action"));//  **** no space in the words   
		
	//   driver.findElement(By.tagName("form"));
	     
	     driver.findElement(By.cssSelector("input#login-button"));//  combination of tagName# id
		 driver.findElement (By.cssSelector("input.btn_action"));//     combination of tagName .clssName.
		 
		 
		driver.findElement(By.tagName("title"));
		driver.findElement(By.name ("login-button")).click();
		
	
		
		//driver.get("http://www.demoqa.com"); // Links 
		
		driver.get("https://demoqa.com/links");
		
		driver.findElement(By.linkText("Home")).click();
	//	driver.findElement(By.partialLinkText("hom")).click();
		
		
		
				
		
	 //  driver.quit();
		
		
	}

}
