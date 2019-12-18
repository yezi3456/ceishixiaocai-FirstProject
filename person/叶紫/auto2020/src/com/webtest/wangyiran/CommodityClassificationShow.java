package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

@Listeners(com.webtest.core.WebTestListener.class)
public class CommodityClassificationShow extends BaseTest{

	
	@Test(description="01�ɹ��޸��Ƽ�")
	//01�޸��Ƽ�
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[6]");
	    Thread.sleep(2000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"f_47\"]");
		assertTrue(webtest.isTextPresent("���Ƽ�"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="02�ɹ��޸�չʾ")
	//02�޸�չʾ
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[6]");
	    Thread.sleep(2000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"sh_47\"]");
		assertTrue(webtest.isTextPresent("��ʾ"));
		webtest.leaveFrame();
	}
	
	@Test(description="60��ѯ��Ʒ����(�ɹ�����:����հ�)")
	//60��ѯ��Ʒ����(�ɹ�����:����հ�)
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[7]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"keyName\"]", "           ");
		webtest.click("xpath=/html/body/div[1]/div[1]/button");
		assertTrue(webtest.isTextPresent("��������"));
		assertTrue(webtest.isTextPresent("Ӫ��Ԫ��"));
		assertTrue(webtest.isTextPresent("������"));
		assertTrue(webtest.isTextPresent("�ֻ�����"));
		assertTrue(webtest.isTextPresent("����ϵͳ"));
		webtest.leaveFrame();
	}
	
}


