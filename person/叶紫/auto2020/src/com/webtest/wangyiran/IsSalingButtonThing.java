package com.webtest.wangyiran;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class IsSalingButtonThing extends BaseTest{
	
	@Test(description="05����Ƽ���ť�Ƽ���Ʒ")
	//05����Ƽ���ť�Ƽ���Ʒ
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");
		webtest.click("xpath=/html/body/div[2]/button[2]");
		assertTrue(webtest.isTextPresent("��Ʒ���"));
		webtest.leaveFrame();
		
	}
	
	
	@Test(description="06�����Ʒ��ť����Ʒ����Ϊ��Ʒ")
	//06�����Ʒ��ť����Ʒ����Ϊ��Ʒ
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");
		webtest.click("xpath=/html/body/div[2]/button[4]");
		assertTrue(webtest.isTextPresent("��Ʒ���"));
		webtest.leaveFrame();
		
	}
	@Test(description="07�����Ʒ��ť����Ʒ����Ϊ��Ʒ")
	//07�����Ʒ��ť����Ʒ����Ϊ��Ʒ
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");
		webtest.click("xpath=/html/body/div[2]/button[3]");
		assertTrue(webtest.isTextPresent("��Ʒ���"));
		webtest.leaveFrame();
		
	}
	
	
	@Test(description="08���������ť����Ʒ����Ϊ����")
	//08���������ť����Ʒ����Ϊ����
	public void test4() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");
		webtest.click("xpath=/html/body/div[2]/button[5]");
		assertTrue(webtest.isTextPresent("��Ʒ���"));
		webtest.leaveFrame();
	
	}
	
	

	
	
	@Test(description="09���ˢ�°�ť")
	//09���ˢ�°�ť
	public void test5() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[10]/div");
		assertTrue(webtest.isTextPresent("��"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="11�����һҳ��ť")
	//11�����һҳ��ť
	public void test6() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[4]/div[1]");
		assertTrue(webtest.isTextPresent("��������"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="12������һҳ��ť")
	//12������һҳ��ť
	public void test7() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[8]/div[2]");
		assertTrue(webtest.isTextPresent("��������"));
		webtest.leaveFrame();
	}
	
	@Test(description="13�����һҳ��ť")
	//13�����һҳ��ť
	public void test8() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[4]/div[2]");
		assertTrue(webtest.isTextPresent("��������"));
	}
	
	@Test(description="14�����һҳ��ť")
	//14�����һҳ��ť
	public void test9() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[8]/div[1]");
		assertTrue(webtest.isTextPresent("��������"));
		webtest.leaveFrame();
	}
	
	


}
