package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class login_page {
	public WebDriver driver;
		@FindBy (xpath = "//input[@name='username']")
		private WebElement username;
		@FindBy (xpath = "//input[@name='password']")
		private WebElement password;
		@FindBy (xpath = "//button[contains(., 'Login')]")
		private WebElement loginbutton;
		
		@FindBy (xpath = "//span[.='jBMVztmddB user']")
		private WebElement dropdown;
		
		@FindBy (xpath = "//li[.='Logout']")
		private WebElement logout;
		
		@FindBy (xpath = "//p[contains(.,'Forgot your password?')]")
		private WebElement forgotpassword;
		
		@FindBy (xpath = "//a[.='OrangeHRM, Inc']")
		private WebElement orangehrminc;
		
		//Initialization
		public login_page(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public void loginMethod() {
			username.sendKeys("Admin");
			password.sendKeys("admin123");
			loginbutton.click();
			
		}
		public void forgotpassword() {
			forgotpassword.click();
		}
		public void orangehrminc() {
			orangehrminc.click();
		}
		public void dropdown() {
			dropdown.click();
			
		}
		public void logout() {
			logout.click();
		}
		
			
		
		
		
	
}
