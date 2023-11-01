import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	     WebDriver driver=new ChromeDriver();          //video  :55:00
		
	     driver.get("https://demo.automationtesting.in/Alerts.html");
		
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("OKTab")).click();   //id="OKTab"
		 
		 driver.switchTo().alert().accept();
		 Thread.sleep(1000);
		 
		// driver.switchTo().alert().dismiss(); //ignoring the 
		 
		 
		 driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		 
		 driver.findElement(By.id("CancelTab")).click();
		 
		 Alert al=driver.switchTo().alert();
		 al.accept();  // you pressed okay
		// al.dismiss();// you pressed cancel
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		 
		 driver.findElement(By.id("Textbox")).click();
		 
		 Alert input=driver.switchTo().alert();
		 input.sendKeys("student");
		 
		 input.accept();
		// input.dismiss();
		 
		// driver.quit();
		 
		 
		 
				 
				 
		 
		 
		 
		 
		 
		 
		 
		 
	
	}

}
