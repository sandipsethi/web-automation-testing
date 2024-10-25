package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgotpassword_page {
	public WebDriver driver;

	@FindBy (xpath = "//input[@name='username']")
	private WebElement forgotpas_username;
	@FindBy (xpath = "//button[contains(., ' Cancel')]")
	private WebElement cancel;
	@FindBy (xpath = "//button[contains(., 'Reset Password')]")
	private WebElement resetpassword;
	
	
	//Initialization
	public forgotpassword_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void forgotpasswordMethod() {
		forgotpas_username.sendKeys("dell");
		
	}
	public void resetpassword() {
		resetpassword.click();
	}
	public void cancel() {
		cancel.click();
	}

}
