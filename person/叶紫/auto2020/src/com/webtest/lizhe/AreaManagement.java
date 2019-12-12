package com.webtest.lizhe;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AreaManagement extends BaseTest{
	@Test(description="�޸�1�����ر������� �Ƿ���ʾ")
	public void test1() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c103\"]/div/span");
		assertTrue(webtest.isTextPresent("�����ر�������"));
		assertTrue(webtest.isTextPresent("��ʾ"));		
		webtest.leaveFrame();
	}
	@Test(description="����һ������")
	public void test2() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");	
		webtest.type("id=areaName", "newArea1");
		webtest.type("id=areaKey", "n");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("newArea1"));
		webtest.leaveFrame();
	}
	@Test(description="������������")
	public void test3() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1002|c106\"]/div/a[1]");	
		webtest.click("xpath=/html/body/div[1]/button[2]");	
		webtest.type("id=areaName", "newArea11");
		webtest.type("id=areaKey", "1");		
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("newArea11"));
		webtest.leaveFrame();
	}
	@Test(description="ɾ��һ������")
	public void test4() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c106\"]/div/a[3]");			
		webtest.click("link=ȷ��");
		webtest.leaveFrame();
	}
	@Test(description="�޸��������������Ϊ1��������ĸΪw")
	public void test5() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1032|c106\"]/div/a[1]");	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1007|c106\"]/div/a[1]");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1005|c106\"]/div/a[2]");
		webtest.type("id=areaKey", "w");
		webtest.typeAndClear("id=areaSort", "1");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("w"));
		webtest.leaveFrame();
	}
	@Test(description="��֤���ذ�ť")
	public void test6() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c106\"]/div/a[1]");	
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("�����ر�������"));
		webtest.leaveFrame();
	}
	
}
