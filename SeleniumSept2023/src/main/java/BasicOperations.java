import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();  // video:  15:00
		
		driver.get("http://www.saucedemo.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).clear();
		
		driver.findElement(By.id ("user-name")). sendKeys("Nitya");
		
	    WebElement pwd=driver.findElement(By.id("password"));
	      pwd.clear();
	       pwd.sendKeys("secret_sauce");
		
		//pwd.clear();
		WebElement button= driver.findElement(By .id("login-button"));
		
		driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).getText();//can be  written like this or 
		
		WebElement credential=driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']"));//created WebElement  
		
		System.out.println(credential.getText());  //video 22:00
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		button.click();
		
		
		
		
		driver.quit();

	}
	
	public void BasicOPerations() {
		

		WebDriver driver=new EdgeDriver();  // video:  15:00
		
		driver.get("http://www.saucedemo.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).clear();
		
		driver.findElement(By.id ("user-name")). sendKeys("Nitya");
		
	    WebElement pwd=driver.findElement(By.id("password"));
	      pwd.clear();
	       pwd.sendKeys("secret_sauce");
		
		//pwd.clear();
		WebElement button= driver.findElement(By .id("login-button"));
		
		driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).getText();//can be  written like this or 
		
		WebElement credential=driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']"));//created WebElement  
		
		System.out.println(credential.getText());  //video 22:00
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		button.click();
	}
	
	public void 

}
