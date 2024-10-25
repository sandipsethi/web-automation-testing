package testcase;

import org.testng.annotations.Test;

import base.base_class;

public class home_page_testcase extends base_class {
	@Test
	public static void homes() throws InterruptedException {
		base_class.setup();
		login.loginMethod();
		Thread.sleep(2000);
		home.recrument();
		Thread.sleep(3000);
		login.dropdown();
		Thread.sleep(3000);
		login.logout();
	}
}
