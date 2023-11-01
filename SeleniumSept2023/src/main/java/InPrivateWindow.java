import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class InPrivateWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		
		
					
					EdgeOptions option=new EdgeOptions();
					
					option.addArguments("--in private");
					
					WebDriver driver= new EdgeDriver();
					
					driver.get("https://www.google.com");
					
					Thread .sleep(5000);
					
					driver.quit();
	}

}
