package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BankManagement extends BaseTest{
	@Test(description="���й��� ���� ��������1")
	public void test1() throws Exception {
		webtest.click("link=���й���");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.type("id=bankName", "��������1");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("��������1"));
		webtest.leaveFrame();
	}
	@Test(description="���й����޸�  ����������1�޸ĳ���������2")
	public void test2() throws Exception {
		webtest.click("link=���й���");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c103\"]/div/a[1]");
		webtest.typeAndClear("id=bankName", "��������2");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("��������2"));
		webtest.leaveFrame();
	}
	@Test(description="ɾ�� ��������2")
	public void test3() throws Exception {
		webtest.click("link=���й���");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c103\"]/div/a[2]");
		webtest.click("link=ȷ��");
		assertFalse(webtest.isTextPresent("��������2"));
		webtest.leaveFrame();
	}
}