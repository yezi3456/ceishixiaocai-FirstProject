package com.webtest.wangliyu;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
public class ZhanghaoguanliTest extends BaseTest {
	
	@Test(priority=3,description="12����֧������")
	public void Test1() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=�˺Ź���");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("link=����֧������");
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("�˺�"));
	}
	
	
	
	@Test(priority=4,description="14�޸�2")
	public void Test3() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginName","tom089");
		Thread.sleep(1000);
		webtest.type("id=loginPwd","123456");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("tom000"));
	}
	
	@Test(priority=5,description="13�޸�(��������)")
	public void Test2() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginName","tom099");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("tom000"));
	}
	
	@Test(priority=6,description="15�޸�(�����û���)")
	public void Test4() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginPwd","123456");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�ֻ�����"));
	}

}
