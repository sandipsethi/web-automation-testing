package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class add_recrument_page {
	public WebDriver driver;
	@FindBy (xpath = "//button[.=' Add ']")
	private WebElement add;
	@FindBy (xpath = "//input[@name='firstName']")
	private WebElement firstname;
	@FindBy (xpath = "//input[@name='middleName']")
	private WebElement middlename;
	@FindBy (xpath = "//input[@name='lastName']")
	private WebElement lastname;
	@FindBy (xpath = "//div[@class='oxd-select-text-input']")
	private WebElement vacancy;
	
	@FindBy (xpath = "(//input[@placeholder='Type here'])[1]")
	private WebElement email;
	@FindBy (xpath = "(//input[@placeholder='Type here'])[2]")
	private WebElement contactno;
	@FindBy (xpath = "//input[@placeholder='Enter comma seperated words...']")
	private WebElement keyword;
	@FindBy (xpath = "//textarea[@placeholder='Type here']")
	private WebElement notes;
	@FindBy (xpath = "//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")
	private WebElement tick;
	@FindBy (xpath = "//button[contains(., 'Save')]")
	private WebElement save;
	
	
	//Initialization
			public add_recrument_page(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			
			
				
			//utilization
			public void add() {
				add.click();
			}
			
			public void add_recrumentMethod() throws AWTException, Exception {
				firstname.sendKeys("sandeep");
				middlename.sendKeys("kumar");
				Thread.sleep(2000);
				lastname.sendKeys("sethy");
				Thread.sleep(2000);
				vacancy.click();
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(2000);
				email.sendKeys("admin@example.com");
				Thread.sleep(2000);
				contactno.sendKeys("8496516326845");
				Thread.sleep(2000);
				keyword.sendKeys("rytghgjdsbfiyughbsdajfsagadsgadsgrasfdgvadsg");
				Thread.sleep(2000);
				notes.sendKeys("tcfgvhbjn tyadbksfyugasfjbhdsyugf.kdasuhgerfdg894fd6g84d6s5g41rd");
				Thread.sleep(2000);
				tick.click();
				Thread.sleep(2000);
				save.click();
			}
	

}
