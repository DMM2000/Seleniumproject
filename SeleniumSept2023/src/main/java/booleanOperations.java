import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class booleanOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver=new ChromeDriver();//video:25
       
       driver.get("https://demo.automationtesting.in/Register.html");
       
       driver.manage().window().maximize();
       
		boolean x= driver. findElement(By.id("checkbox1")).isSelected();
		
		System.out.println("is Selected:"+ x);
		
		boolean y= driver.findElement(By.id("checkbox1")).isDisplayed();
		
		System.out.println("isDisplayed:"+ y);
		
		boolean z=driver.findElement(By.id("checkbox1")).isEnabled();
		
		System.out.println("is Enabled:"+ z);
		 
		
          driver .quit();
	}

}
