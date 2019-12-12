package com.webtest.lizhe;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class PayManagement  extends BaseTest{
	@Test(description="��װ΢��")
	public void test1() throws Exception {
		webtest.click("link=֧������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c106\"]/div/a");
		webtest.typeAndClear("id=payName", "΢��֧��");
		webtest.typeAndClear("id=appId", "111");
		webtest.typeAndClear("id=mchId", "222");
		webtest.typeAndClear("id=apiKey", "333");
		webtest.typeAndClear("id=appsecret", "333");
		webtest.typeAndClear("id=payDesc", "����΢��֧��");
		webtest.typeAndClear("id=payOrder", "1");
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("����΢��֧��"));
		webtest.leaveFrame();
	}
	
//	@Test(description="֧������ж�ػ�������",priority=2)
//	public void deleteHDFK() throws Exception {
//		webtest.click("link=֧������");
//		webtest.enterFrame("wst-lframe-1");
//		webtest.click("xpath=//*[@id=\"maingrid|2|r1003|c106\"]/div/a[2]");
//		webtest.click("link=ȷ��");
//		assertTrue(webtest.isTextPresent("��������"));
//		assertTrue(webtest.isTextPresent("��װ"));
//		webtest.leaveFrame();
//	}
	@Test(description="�޸�΢��֧������")
	public void test2() throws Exception {
		webtest.click("link=֧������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c106\"]/div/a[1]");
		webtest.typeAndClear("id=payDesc", "΢��֧��");
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("΢��֧��"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="ж��΢��֧��")
	public void test3() throws Exception {
		webtest.click("link=֧������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id='maingrid|2|r1001|c106']/div/a[2]");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("΢��֧��"));
		assertTrue(webtest.isTextPresent("��װ"));
		webtest.leaveFrame();
	}
	
}