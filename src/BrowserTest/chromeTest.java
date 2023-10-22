package BrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import dev.failsafe.internal.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

class chromeTest{

	public static void main(String[] args) throws InterruptedException
	{
	//	System.out.println(System.getProperty("user.dir"));
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"Resources/Driver/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		// Initialize the ChromeDriver
      //  WebDriver driver = new ChromeDriver();
        
 
        // Navigate to a URL
        driver.get("https://www.automationanywhere.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
     // Identify and click the "Accept" or "Agree" button for cookies
            WebElement acceptButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
            if(acceptButton.isDisplayed()) {
            acceptButton.click();
            }
            WebElement ele = driver.findElement(By.xpath("//a[@href='/products' and text()='Products']"));

          //Creating object of an Actions class
          Actions action = new Actions(driver);

          //Performing the mouse hover action on the target element.
          action.moveToElement(ele).perform();
          Thread.sleep(3000);
     // Find the web element to hover over
       // WebElement elementToHover = driver.findElement(By.xpath("(//a[@href='/products'])[1]")); 
        // Create an Actions object
    //    Actions actions = new Actions(driver);
        // Perform the mouse hover
      //  actions.moveToElement(elementToHover).perform();
     // Find the web element to click
        WebElement elementToClick = driver.findElement(By.xpath("(//a[@href='/products/process-discovery'])[1]"));       
//        Perform Click
        elementToClick.click();
        
	}
}

