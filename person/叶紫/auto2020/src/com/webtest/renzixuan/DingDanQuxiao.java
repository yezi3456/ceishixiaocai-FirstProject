package com.webtest.renzixuan;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;

public class DingDanQuxiao extends BaseTest1{
    String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(priority=2,description="20.ɾ��-�ѷ���������һ��")
	public void a() throws Exception{
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
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
	
	@Test(priority=3,description="21.ɾ��ȡ��/���ն�����һ��")
	public void b() throws Exception{
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
	

	@Test(priority=4,description="22.ɾ��-���ջ�������һ��")
	public void c() throws Exception{
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
	
		
	@Test(priority=5,description="23.ɾ��-������������һ��")
	public void d() throws Exception{
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
