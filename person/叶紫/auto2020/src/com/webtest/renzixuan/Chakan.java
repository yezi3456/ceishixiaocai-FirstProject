package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class Chakan extends BaseTest1{
	String url="http://localhost/wstshop/admin/index/login.html";
	
	
	@Test(priority=2,description="7.�ܷ�������������")
	public void a() throws Exception{
		//��¼��̨
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("��ѯ"));
    }
	
	@Test(priority=3,description="8.�ܷ����������")
	public void b() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("��ѯ"));
    }
	
	
	@Test(priority=4,description="9.�ܷ����˿��")
	public void c() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[5]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
		
	@Test(priority=5,description="10.�ܷ����ѷ�������")
	public void d() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[3]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(priority=6,description="11.�ܷ���ȡ��/���ն���")
	public void k() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[4]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(priority=7,description="12.�ܷ������ջ�����")
	public void l() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
}
