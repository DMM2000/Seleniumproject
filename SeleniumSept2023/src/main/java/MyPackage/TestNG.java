package MyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNG {
	
	     @Test
	     public void Navigation() {
		
		WebDriver driver  = new ChromeDriver();//video day 4 (1.12.00)
		driver.get("http://www.google.com");
		driver.manage().window().maximize(); 
		driver.navigate(). to("http://www.amazon.com");
	//	driver.get("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();}
		
		 @Test   (enabled=false)
		public void Loactors()   {
			WebDriver driver = new ChromeDriver();//to
		
		 driver.get ("http://www.saucedemo.com");
		
	//	driver.navigate().to("http://google.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By. id ("user-name")).sendKeys("Deepa");
		
	//	driver.findElement(By.name("user-name"));//.sendKeys("secret_sauce");
		
	     driver.findElement(By.id("password")).sendKeys("dancing");
	     
	     driver.findElement(By.className("btn_action"));//  **** no space in the words   
		
	//   driver.findElement(By.tagName("form"));
	     
	     driver.findElement(By.cssSelector("input#login-button"));//  combination of tagName# id
		 driver.findElement (By.cssSelector("input.btn_action"));//     combination of tagName .clssName.
		 
		 
		driver.findElement(By.tagName("title"));
		driver.findElement(By.name ("login-button")).click();}
		
			
			
			
			
			
			
			
		
		 
		 public void booleanOperations() {
			 WebDriver driver=new ChromeDriver();//video:25
	       
	       driver.get("https://demo.automationtesting.in/Register.html");
	       
	       driver.manage().window().maximize();
	       
			boolean x= driver. findElement(By.id("checkbox1")).isSelected();
			
			System.out.println("is Selected:"+ x);
			
			boolean y= driver.findElement(By.id("checkbox1")).isDisplayed();
			
			System.out.println("isDisplayed:"+ y);
			
			boolean z=driver.findElement(By.id("checkbox1")).isEnabled();
			
			System.out.println("is Enabled:"+ z);
			 
			
	          driver .quit();}
			 
			 
			 
			 
		 
		
		
		
		
		
		
		
	
	     @Test    
        public void HandleFrames() {
	 
	 
	 
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
		
		driver.quit();}
		
	
 
	     @Test (enabled=false)
	public void KeyboardAndMouseActions() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement interaction = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		WebElement dragAndDrop = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		WebElement staTic = driver.findElement(By.xpath("//a[text()='Static ']"));
		Actions action = new Actions(driver);// CLassName obj = new ClassName();
		action.moveToElement(interaction).moveToElement(dragAndDrop).moveToElement(staTic).click().perform();		
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));		
		WebElement drag = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement drop = driver.findElement(By.id("droparea"));
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		action.contextClick(drop).perform();  // Right click 
		Thread.sleep(2000);
		action.doubleClick(drag).perform();  // double click 
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}}
	
	
	
	
	
	
	
	
	
	
	