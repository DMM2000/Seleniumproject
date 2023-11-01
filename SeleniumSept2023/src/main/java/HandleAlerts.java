import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver =new ChromeDriver();//video 50:00
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();

	}

}
