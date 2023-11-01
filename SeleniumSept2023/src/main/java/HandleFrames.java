import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage(). window().maximize();
		
		WebElement demo =driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(demo);		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
		
		driver.switchTo().defaultContent();	
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
	   WebElement parent=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']" ));
	   driver.switchTo().frame(parent);
	
	   WebElement child=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));	 
	   // WebElement child=driver.findElement(By.xpath("/html/body/section/div/div/iframe")); //try to go little up to check the frame is covered
	     driver.switchTo().frame(child);
	   driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("1112345"); //copy xpath from site right click and copy the path
	 
	   driver.switchTo().parentFrame();
	   
	   
	   
	   
	    
	    driver.switchTo().defaultContent();
	   //   driver.switchTo().frame(parent);
	    // driver.switchTo().frame(child);
		
		driver.quit();
		
		

	}

}
