package testcase;


import org.testng.annotations.Test;

import base.base_class;

public class forgotpassword_testcase  extends base_class{
	@Test (priority = 2)
	public void forgotpassword() throws InterruptedException {
		base_class.setup();
		Thread.sleep(2000);
		login.forgotpassword();
		Thread.sleep(2000);
		forgotpasswords.forgotpasswordMethod();
		Thread.sleep(2000);
		forgotpasswords.resetpassword();
		
	}
}
