import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWait {///video 1:25
	//1.Implicit wait --page Load 
	//2. Explicit wait--Waiting for certain conditions.  
	WebDriver driver;
	@Test
	public void ImplicitWaitTypes() {
		
		WebDriver driver =new EdgeDriver();	
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
	//	WebDriverWait wait = new WebDriverWait(driver,(Duration.ofSeconds(20)));
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
	//	System.out.println("The Element is visible");
		
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		ExplicitWait(firstName);
		driver.quit();
	}
	
	
	public void ExplicitWait(WebElement e) {
		
		WebDriverWait wait = new WebDriverWait(driver,(Duration.ofSeconds(20)));
		wait.until(ExpectedConditions.visibilityOf(e));
		wait.until(ExpectedConditions.invisibilityOf(e));
		
		driver.quit();
		
		
	}

}
