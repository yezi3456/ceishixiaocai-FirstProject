package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class OpenFriendshipLinkTest extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
		webtest.click("link=���¼");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);

	}
	
	@Test(description="030�򿪵�1��������")
	public void test30() throws Exception{
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=WSTMart���̻���");
		webtest.switchWidow(1);
		assertTrue(webtest.isTextPresent("��ӭ����WSTMart����"));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
		
	}
	
	@Test(description="031�򿪵�2��������")
	public void test31() throws Exception{
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=WSTMart��̳");
		webtest.switchWidow(1);
		assertTrue(webtest.isTextPresent("�������"));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="032�򿪵�3��������")
	public void test32() throws Exception{
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=�������");
		webtest.switchWidow(1);
		assertTrue(webtest.isTextPresent("�������"));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="033�򿪵�4��������")
	public void test33() throws Exception{
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=WSTMall����O2Oϵͳ");
		webtest.switchWidow(1);
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��ӭ����WSTMall����"));
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(6000);
		
	}
	
	@Test(description="034�򿪵�5��������")
	public void test34() throws Exception{
		Thread.sleep(4000);
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=WSTMall��̳");
		webtest.switchWidow(1);
		assertTrue(webtest.isTextPresent("�������"));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
		
	}


}
