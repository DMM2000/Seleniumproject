package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class fileupload {  //video 7 
	
	
	
	
	@Test
	public void upload() { 
	WebDriver driver =new EdgeDriver();
	
	driver.get(("https://demo.automationtesting.in/Register.html"));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    driver.manage().window().maximize();
    WebElement e=driver.findElement(By.xpath("//input[@type='file']"));
    e.sendKeys("D:\\DEEPA\\Lexus.jpg");
   // driver.quit();
    }
	
	//video time 18:00
	
	@Test
	public void WebTable() {
	WebDriver driver =new EdgeDriver();	
	driver.get("file:///D:/DEEPA%20QA%20AND%20SQL/SELENIUM2023/page.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//table[@name='BookTable']"));
	List<WebElement> rows=driver.findElements(By.xpath("//table//tr"));
	System.out.println("Table Rows:"+rows.size());
	for(WebElement r:rows) {
		System.out.println(r.getText());
	}
	List<WebElement> headers=driver.findElements(By.xpath("//table//th"));	
	System.out.println("Table Headers:"+headers.size());
	for (WebElement h:headers){
		System.out.println(h.getText());
		
	}
	}
	
	@Test            
	public void WebTableData() { //video :28
		
		WebDriver driver =new EdgeDriver();	//40
		driver.get("file:///D:/DEEPA%20QA%20AND%20SQL/SELENIUM2023/page.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize(); 
		
		List<WebElement> data= driver.findElements(By.xpath("//table//td"));
		System.out.println("Table data"+data.size());
		for (WebElement d:data) {
			System.out.println(d.getText());
			
			String str=d.getText();
			if (str.equals("2000"))
			
			{System.out.println("pass");}
			else
			{System.out.println("Fail");}
				
		
		}
			driver.quit();
		}
		
		
		
		
	}
    
 
    

