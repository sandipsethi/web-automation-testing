package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homes_pages {
	public WebDriver driver;
	@FindBy(xpath = "//button[@type='button']")
	private WebElement slidebutton;
	@FindBy(xpath = "//span[.='Admin']")
	private WebElement admin;
	@FindBy(xpath = "//span[.='PIM']")
	private WebElement pim;
	@FindBy(xpath = "//span[.='Leave']")
	private WebElement leave;
	@FindBy(xpath = "//span[.='Time']")
	private WebElement time;
	@FindBy(xpath = "//span[.='Recruitment']")
	private WebElement recrument;
	@FindBy(xpath = "//span[.='My Info']")
	private WebElement myinfo;
	@FindBy (xpath = "//span[.='Performance']")
	private WebElement performance;
	@FindBy(xpath = "//span[.='Directory']")
	private WebElement directory;
	@FindBy(xpath = "//span[.='Maintenance']")
	private WebElement maintenance;
	@FindBy(xpath = "//span[.='Claim']")
	private WebElement claim;
	@FindBy(xpath = "//span[.='Buzz']")
	private WebElement buzz;
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement update;
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement search;
	
	
	
	//Initialization
	public  homes_pages( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void recrument() {
		recrument.click();
	}
	
	
}
