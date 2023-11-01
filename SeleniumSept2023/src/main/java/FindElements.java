import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElements {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver =new EdgeDriver();
		//WebDriver driver= new ChromeDriver();   video: 6:00
		
		driver.get ("https://demo.automationtesting.in/Register.html");
	//	WebElement single = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

		WebElement single = driver.findElement(By.xpath("//input[@'placeholder='FirstName']")); //xpath= "tagname[@attribute='value'] "     
		
		List	<WebElement> multiple= driver.findElements(By.xpath("input[@type='Text']"));//multiple Elements *****Interview questions*****
	   
	   System.out.println(multiple.size());
		
     driver.quit();
	}

}
