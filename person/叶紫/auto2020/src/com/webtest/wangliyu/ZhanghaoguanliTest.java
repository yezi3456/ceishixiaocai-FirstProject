package com.webtest.wangliyu;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
@Listeners(com.webtest.core.WebTestListener.class)
public class ZhanghaoguanliTest extends BaseTest {
	
	@Test(description="12����֧������")
	public void test1() throws InterruptedException{
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=�˺Ź���");
//		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=�˺Ź���");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("link=����֧������");
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("�˺�"));
//		webtest.leaveFrame();
	}
	
	
	
	@Test(description="14�޸�2")
	public void test2() throws InterruptedException{
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=�˺Ź���");
//		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id='maingrid|2|r1002|c108']/div/a[1]");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginName","tomdd");
		Thread.sleep(1000);
		webtest.type("id=loginPwd","123456");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�˺�"));
//		webtest.leaveFrame();
	}
	
	@Test(description="13�޸�(��������)")
	public void test3() throws InterruptedException{
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=�˺Ź���");
//		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=�޸�");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginName","tom099");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("tom000"));
//		webtest.leaveFrame();
	}
	
	@Test(description="15�޸�(�����û���)")
	public void test4() throws InterruptedException{
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=�˺Ź���");
//		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id='maingrid|2|r1001|c108']/div/a[1]");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginPwd","123456");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��¼�˺Ų���Ϊ��"));
	}

}
