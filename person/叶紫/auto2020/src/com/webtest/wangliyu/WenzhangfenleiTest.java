package com.webtest.wangliyu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class WenzhangfenleiTest extends BaseTest {
	
	@Test(description="30��������success")
	public void test1() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[5]/div[2]");
		webtest.click("link=���·���");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/button");
		Thread.sleep(3000);
		webtest.type("id=catName","����");
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("��ͨ����"));	
	}
	
	@Test(description="31�����ӷ���success")
	public void test2() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=�����ӷ���");
		Thread.sleep(3000);
		webtest.type("id=catName","����success");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("��ͨ����"));	
	}
	
	@Test(description="32�����ӷ���fail(����ӷ�������)")
	public void test3() throws Exception{
		Thread.sleep(3000);
		
		webtest.click("link=�����ӷ���");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�������Ʋ���Ϊ��"));	
	}
	
	@Test(description="33�����ӷ���fail�����������")
	public void test4() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");
		Thread.sleep(3000);
		webtest.click("link=�����ӷ���");
		Thread.sleep(3000);
		webtest.type("id=catName","������������");
		Thread.sleep(3000);
		webtest.typeAndClear("id=catSort","");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("����Ų���Ϊ��"));	
	}
	
	@Test(description="34�����ӷ���fail�������Ϊ������")
	public void test5() throws Exception{
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");
		Thread.sleep(3000);
		webtest.click("link=�����ӷ���");
		Thread.sleep(3000);
		webtest.type("id=catName","������������");
		Thread.sleep(3000);
		webtest.typeAndClear("id=catSort","");
		Thread.sleep(3000);
		webtest.type("id=catSor","aaa");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�������·���"));	
	}
	
	@Test(description="35ɾ��")
	public void test6() throws Exception{
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");
		Thread.sleep(3000);
		webtest.click("link=ɾ��");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��������"));	
	}
	
	@Test(description="36�޸�success")
	public void test7() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(3000);
		webtest.typeAndClear("id=catName","");
		Thread.sleep(3000);
		webtest.type("id=catName","����");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��������"));	
	}
	
	
}
