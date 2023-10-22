package BrowserTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

class chromeTest{

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://www.automationanywhere.com/");
		driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
		
	WebElement button = driver
			.findElement(By.xpath("//a[@class=\"coh-link utility-nav-link coh-style-solid-orange-button\"]"));
	button.click();

	String newURL = driver.getCurrentUrl();
	String expected = "https://www.automationanywhere.com/request-live-demo";
	System.out.println("Program4 URL is: " + newURL);
	Assert.assertEquals(newURL, expected);

	String firstName = driver.findElement(By.xpath("//label[@id=\"LblFirstName\"]")).getText();
	System.out.println("Label Name for First Name is: " + firstName);
	String lastName = driver.findElement(By.xpath("//label[@id='LblLastName']")).getText();
	System.out.println("Label for Last Name is: " + lastName);

        
	}
}