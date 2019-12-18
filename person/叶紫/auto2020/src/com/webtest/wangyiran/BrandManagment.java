package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

@Listeners(com.webtest.core.WebTestListener.class)
public class BrandManagment extends BaseTest{

	@Test(description="61�ɹ���ѯƷ������")
	//61��ѯƷ������(�ɹ�����)
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"key\"]", "־��");
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("1"));
		webtest.leaveFrame();
	}
	

	@Test(description="64�޸�Ʒ������(�ɹ�����)")
	//64�޸�Ʒ������(�ɹ�����)
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1007|c105\"]/div/a[1]");
		webtest.type("xpath=//*[@id=\"brandName\"]", "test01");
		webtest.click("xpath=//*[@id=\"brandForm\"]/table/tbody/tr[6]/td/button[1]");
		assertTrue(webtest.isTextPresent("test01"));
		webtest.leaveFrame();
	}
	

	@Test(description="65�޸�Ʒ������(ʧ������:����հ�)")
	//65�޸�Ʒ������(ʧ������:����հ�)
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1007|c105\"]/div/a[1]");
		webtest.type("xpath=//*[@id=\"brandName\"]", "       ");
		webtest.click("xpath=//*[@id=\"brandForm\"]/table/tbody/tr[6]/td/button[1]");
		assertTrue(webtest.isTextPresent("Ʒ�����Ʋ���Ϊ��"));
		webtest.leaveFrame();
	}
	

	
	@Test(description="67�����б��ѯ(�ɹ�����)")
	//67�����б��ѯ(�ɹ�����)
	public void test4() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.selectByValue("id=catId", "47");
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("����ũ��"));
		webtest.leaveFrame();
	}


}
