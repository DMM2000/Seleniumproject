import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardActions {

	public static void main(String[] args) {//static public void main is also correct
		
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver. manage().window().maximize();
		
		
		WebElement video=driver.findElement(By.xpath("//a[text()='Video']"));
		
	//	WebElement vimeo=driver.findElement(By.xpath("//a[text()='Vimeo']"));
		WebElement youtube=driver.findElement(By.xpath("//a[text()='Youtube']"));
		
		 Actions action=new Actions(driver);   //ClassName obj=new ClassName();//create object in java.
		 action.moveToElement(video).moveToElement(youtube).click().perform();
		 
		 WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		 
		 action.contextClick(home).perform();
		 action.doubleClick (home).perform();
		 
		 
		
		
		
		
		

	}

}
