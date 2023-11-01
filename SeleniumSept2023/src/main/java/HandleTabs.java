import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
          WebDriver driver = new ChromeDriver();//video:1:20:00
		
		 driver.get ("https://demo.automationtesting.in/Windows.html");
		
	//	 driver.navigate().to("http://google.com");
		
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		
		
		
		
		Set<String> windowHandles = driver.getWindowHandles();//Set will never store a duplicate window.
		String firstTab = (String)windowHandles.toArray()[0];
		String secondTab = (String)windowHandles.toArray()[1];
		driver.switchTo().window(secondTab);
		Thread.sleep(500);
		driver.switchTo().window(firstTab);
		Thread.sleep(500);
		driver.switchTo().window(secondTab);
		Thread.sleep(500);
		driver.switchTo().window(firstTab);
		Thread.sleep(500);
		driver.switchTo().window(secondTab);
		
		driver. quit();


	}

}
