package com.webtest.wangliyu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class Out extends BaseTest {
	
	@Test(description="39�������success")
	public void test1() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"topmenu\"]/div[2]/a[3]");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�������"));
			
		
	}
	
	@Test(description="40�˳�ϵͳsuccess")
	public void test2() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=�˳�ϵͳ");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[7]/div[3]/a[1]");	
		assertTrue(webtest.isTextPresent("WSTShop��̨����ϵͳ"));
		
	}
	


}
