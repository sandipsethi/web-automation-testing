package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.forgotpassword_page;
import pages.homes_pages;
import pages.login_page;
import pages.add_recrument_page;

public class base_class {
	public static WebDriver driver;
	public static login_page login;
	public static forgotpassword_page forgotpasswords;
	public static homes_pages home;
	public static add_recrument_page recrumentsss;
	
	
	
	
	public static void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
		element.sendKeys("orangehrm");
		WebElement element1 = driver.findElement(By.xpath("//span[.='OrangeHRM']"));
		element1.click();
		WebElement element3 = driver.findElement(By.xpath("(//h3[.='OrangeHRM'])[1]"));
		element3.click();
		
		login=new login_page(driver);
		forgotpasswords=new forgotpassword_page(driver);
		home= new homes_pages(driver);
		recrumentsss = new add_recrument_page(driver);
		
		
	}


}
