package testcase;

import org.testng.annotations.Test;

import base.base_class;




public class login_page_test_class extends base_class {
	@Test (priority = 1)
	public static void login(Object fileUtils) throws InterruptedException {
		base_class.setup();
		Thread.sleep(2000);
		login.loginMethod();
		Thread.sleep(2000);
		login.dropdown();
		Thread.sleep(2000);
		login.dropdown();
		//TakesScreenshot screenshots = ((TakesScreenshot)driver);
//		File src=screenshots.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\sandeep\\Desktop\\fullpage.png");
		
		
		
	}
}
