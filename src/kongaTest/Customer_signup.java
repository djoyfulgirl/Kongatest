package kongaTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customer_signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Drivers\\driver\\chromedriver.exe");
		//create an instance of the driver to launch browser
		WebDriver browser = new ChromeDriver();
		

		browser.get("https://www.konga.com/");
		
		browser.manage().window().maximize();
		browser.manage().deleteAllCookies();
		
		//Creating an instance of driver, to launch browser
		//WebDriver browser = new FirefoxDriver();
		
		//to open the Konga home page
		browser.get("https://www.konga.com/");
		
		browser.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//to maximize the browser
		browser.manage().window().maximize();
		
		//to check the actual url is displayed
		System.out.println(browser.getTitle());
		
		//to click the login/signup button
		browser.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[3]/div/div[3]/div[2]/a")).click();
		
		//to write phone number into email/phone number field
		browser.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tawadlove@yahoo.com");
		
		//to write password into the password field
		browser.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("olaseun16");
		
		//to click the login button
		browser.findElement(By.xpath("//button[@class='_0a08a_3czMG _988cf_1aDdJ']")).click();
		
		//to write Item name into search field
		browser.findElement(By.xpath("//form[@class='f6ed2_25oVd']//input[@id='jsSearchInput']")).sendKeys("Samsung S10");
		
		//to click the search button
		browser.findElement(By.xpath("//form[@class='f6ed2_25oVd']//button[@class='fdd83_39Iap']")).click();
		
		//to click the add to cart button
		browser.findElement(By.xpath("//li[1]//div[1]//div[1]//div[2]//form[1]//div[4]//button[1]")).click();
		
		//to close the browser
		browser.close();
	}

}