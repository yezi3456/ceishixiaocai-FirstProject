package com.webtest.renzixuan;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class Xiangqing extends BaseTest1{

	String url="http://localhost/wstshop/admin/index/login.html";
	

	@Test(priority=2,description="45.�����������鿴����鿴����")
	public void chakan() throws Exception {
		//��¼��̨
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		assertTrue(webtest.isTextPresent("�˳�ϵͳ"));

		Thread.sleep(2000);	
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
	

	@Test(priority=3,description="46.�ѷ��������鿴����鿴����")
	public void chakan1() throws Exception {
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
	
	@Test(priority=4,description="47.ȡ��/���ն����鿴����鿴����")
	public void chakan2() throws Exception {
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
	
	
	@Test(priority=5,description="48.���ջ������鿴����鿴����")
	public void chakan3() throws Exception {
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
	
	@Test(priority=6,description="49.��������������������źͿ�ݹ�˾�Ƿ���Է����ɹ�")
	public void chakan4() throws Exception {
		webtest.leaveFrame();
		//��¼��̨
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-35");	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertFalse(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(priority=7,description="50.��������������ֻ��д�����Ƿ񷢻��ɹ�")
	public void chakan5() throws Exception {
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
	
	@Test(priority=8,description="51.����������������д���ź͹�˾�Ƿ񷢻��ɹ�")
	public void chaka6() throws Exception {
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
