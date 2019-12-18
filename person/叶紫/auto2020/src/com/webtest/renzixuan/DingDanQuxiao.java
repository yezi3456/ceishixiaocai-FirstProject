package com.webtest.renzixuan;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class DingDanQuxiao extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}
	
	@Test(description="20.ɾ��-�ѷ���������һ��")
	public void test1() throws Exception{
		//�����������
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		//����ѷ�������
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[3]");
		Thread.sleep(2000);	
		//��ȥ�Ǹ�iframe
		webtest.enterFrame("wst-lframe-35");
		Thread.sleep(2000);	
		//���ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		//���ȷ��
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(description="21.ɾ��ȡ��/���ն�����һ��")
	public void test2() throws Exception{
		webtest.leaveFrame();
		//�����������
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		//���ȡ��/���ն���
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[4]");
		Thread.sleep(2000);	
		//��ȥ�Ǹ�iframe
		webtest.enterFrame("wst-lframe-35");
		Thread.sleep(2000);	
		//���ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		//���ȷ��
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	

	@Test(description="22.ɾ��-���ջ�������һ��")
	public void test3() throws Exception{
		webtest.leaveFrame();
		//�����������
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		//������ջ�����
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		Thread.sleep(2000);	
		//��ȥ�Ǹ�iframe
		webtest.enterFrame("wst-lframe-35");
		Thread.sleep(2000);	
		//���ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		//���ȷ��
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("��ѯ"));
	 }
	
		
	@Test(description="23.ɾ��-������������һ��")
	public void test4() throws Exception{
		webtest.leaveFrame();
		//�����������
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		//�������������
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		Thread.sleep(2000);	
		//��ȥ�Ǹ�iframe
		webtest.enterFrame("wst-lframe-35");
		Thread.sleep(2000);	
		//���ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[3]");
		//���ȷ��
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("��ѯ"));
    }
}
