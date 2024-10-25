package testcase;


import org.testng.annotations.Test;

import base.base_class;

public class recrument_page_testcase extends base_class {
	@Test
	public void recrument() throws Exception, Exception {
		base_class.setup();
		Thread.sleep(2000);
		login.loginMethod();
		Thread.sleep(2000);
		home.recrument();
		Thread.sleep(2000);
		recrumentsss.add();
		Thread.sleep(2000);
		recrumentsss.add_recrumentMethod();
		Thread.sleep(3000);
		login.dropdown();
		Thread.sleep(3000);
		login.logout();
		
	}
}
