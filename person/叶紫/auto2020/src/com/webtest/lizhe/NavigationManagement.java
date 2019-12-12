package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class NavigationManagement extends BaseTest{
	@Test(description="�����������޸ĵ�һ����������Ϊ����")
	public void test1() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c108\"]/div/a[1]");
		webtest.typeAndClear("id=navTitle", "����");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("����"));
		webtest.leaveFrame();
	}
	@Test(description="������������������1")
	public void test2() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.click("link=ȷ��");
		webtest.type("id=navTitle", "��������1");
		webtest.type("id=navUrl","http://www.wstmart.net");
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("��������1"));
		webtest.leaveFrame();
	}
	@Test(description="����������ɾ��һ������ ��������1")
	public void test3() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
//		webtest.click("xpath=//*[@id=\"maingrid|2|r1002|c108\"]/div/a[1]");
		webtest.click("xpath=//*[@id='maingrid|2|r1001|c108']/div/a[2]");
		webtest.click("link=ȷ��");
		assertFalse(webtest.isTextPresent("��������1"));
		webtest.leaveFrame();
	}
	@Test(description="ˢ��")
	public void test4() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
//		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/div/a[1]");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[10]/div/span");
		assertTrue(webtest.isTextPresent("��������"));
		webtest.leaveFrame();
	}
	@Test(description="ֱ�ӵ�� ����1 �ı���ʾ������״̬")
	public void test5() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c105\"]/div/span");
		assertTrue(webtest.isTextPresent("��ʾ"));
		assertTrue(webtest.isTextPresent("����"));
		webtest.leaveFrame();
	}
}
