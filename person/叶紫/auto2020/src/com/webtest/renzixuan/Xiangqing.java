package com.webtest.renzixuan;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class Xiangqing extends BaseTest1{

	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}
	

	@Test(description="45.�����������鿴����鿴����")
	public void test1() throws Exception {
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-35");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[1]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(7000);	
		webtest.click("xpath=/html/body/div/div[6]/input");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	

	@Test(description="46.�ѷ��������鿴����鿴����")
	public void test2() throws Exception {
		webtest.leaveFrame();
		//��¼��̨
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[3]");
		webtest.enterFrame("wst-lframe-35");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[1]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(7000);	
		webtest.click("xpath=/html/body/div/div[6]/input");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(description="47.ȡ��/���ն����鿴����鿴����")
	public void test3() throws Exception {
		webtest.leaveFrame();
		//��¼��̨
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[4]");
		webtest.enterFrame("wst-lframe-35");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[1]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(7000);	
		webtest.click("xpath=/html/body/div/div[6]/input");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	
	@Test(description="48.���ջ������鿴����鿴����")
	public void test4() throws Exception {
		webtest.leaveFrame();
		//��¼��̨
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		webtest.enterFrame("wst-lframe-35");	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[1]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(7000);	
		webtest.click("xpath=/html/body/div/div[6]/input");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(description="49.��������������������źͿ�ݹ�˾�Ƿ���Է����ɹ�")
	public void test5() throws Exception {
		webtest.leaveFrame();
		//��¼��̨
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-35");	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertFalse(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(description="50.��������������ֻ��д�����Ƿ񷢻��ɹ�")
	public void test6() throws Exception {
		webtest.leaveFrame();
		//��¼��̨
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-35");	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		webtest.type("id=expressNo","100000000101");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(description="51.����������������д���ź͹�˾�Ƿ񷢻��ɹ�")
	public void test7() throws Exception {
		webtest.leaveFrame();
		//��¼��̨
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-35");	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"expressId\"]/option[2]");
		webtest.type("id=expressNo","100000000101");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
}
