package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.NSDataProvider;

public class Chaxun extends BaseTest1{
String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(priority=1,description="13.������������ջ������б�����ݶ������100000003��ѯ��������")
	public void chakan() throws Exception {
		//��¼��̨
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		webtest.enterFrame("wst-lframe-35");
		webtest.type("id=orderNo","100000003");
		webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
		webtest.click("xpath=//*[@id=\"deliverType\"]/option[3]");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	

	@Test(priority=2,description="14.������������ջ������б�����ݶ�����Ų�ѯ���鲻�������������������ѡ�������������һ�����������ڵĶ����ţ�")
	public void chakan1() throws Exception {
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
		webtest.click("xpath=//*[@id=\"deliverType\"]/option[2]");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	

		@Test(priority=3,description="15.��������Ĵ����������б�����ݶ������100000202��ѯ��������")
		public void chakan2() throws Exception {
			webtest.leaveFrame();
			//�������������
			webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
			webtest.enterFrame("wst-lframe-35");
			webtest.type("id=orderNo","100000202");
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=//*[@id=\"deliverType\"]/option[1]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
		
		@Test(priority=4,description="16.��������Ĵ����������б�����ݶ�����Ų�ѯ���鲻�������������������ѡ�������������һ�����������ڵĶ����ţ�")
		public void chakan3() throws Exception {
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=//*[@id=\"deliverType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
	
		@Test(priority=5,description="16.����������ѷ��������б�����ݶ������100000036��ѯ��������")
		public void chakan4() throws Exception {
			webtest.leaveFrame();
	        //����ѷ�������
			webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[3]");
			Thread.sleep(2000);	
			webtest.enterFrame("wst-lframe-35");
			Thread.sleep(2000);	
			webtest.type("id=orderNo","100000036");
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[3]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
		
		
		@Test(priority=6,description="17.����������ѷ��������б�����ݶ�����Ų�ѯ���鲻�������������������ѡ�������������һ�����������ڵĶ����ţ�")
		public void chakan5() throws Exception {
			//��¼��̨
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
		
	
		@Test(priority=7,description="18.���������ȡ��/���ն����б�����ݶ������100000003��ѯ��������")
		public void chakan6() throws Exception {
			webtest.leaveFrame();
			//���ȡ��/���ն���
			webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[4]");
			webtest.enterFrame("wst-lframe-35");
			webtest.type("id=orderNo","100000014");
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[3]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
		
	
		@Test(priority=8,description="19.���������ȡ��/���ն����б�����ݶ�����Ų�ѯ���鲻�������������������ѡ�������������һ�����������ڵĶ����ţ�")
		public void chakan7() throws Exception {
			//��¼��̨
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
}
