package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestHome extends TestBase {
@Test(priority=1)
public void checkFashion() throws InterruptedException
{
	h.clickonFasion();
	Thread.sleep(3000);
	//u.cartclick();
	u.checklogo();
}
@Test(priority=2)
public void checkMobile() throws InterruptedException
{
	h.clickonmobile();
	Thread.sleep(3000);
//    u.cartclick();
//    s.assertNotEquals(true,false);
	u.checklogo();
	s.assertAll();
}
}
