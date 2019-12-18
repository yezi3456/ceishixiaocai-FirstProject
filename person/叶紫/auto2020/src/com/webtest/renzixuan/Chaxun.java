package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class Chaxun extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}
	
	@Test(description="13.������������ջ������б�����ݶ������100000003��ѯ��������")
	public void test1() throws Exception {
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		webtest.enterFrame("wst-lframe-35");
		webtest.type("id=orderNo","100000003");
		webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
		webtest.click("xpath=//*[@id=\"deliverType\"]/option[3]");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	

	@Test(description="14.������������ջ������б�����ݶ�����Ų�ѯ���鲻�������������������ѡ�������������һ�����������ڵĶ����ţ�")
	public void test2() throws Exception {
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
		webtest.click("xpath=//*[@id=\"deliverType\"]/option[2]");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	

		@Test(description="15.��������Ĵ����������б�����ݶ������100000202��ѯ��������")
		public void test3() throws Exception {
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
		
		@Test(description="16.��������Ĵ����������б�����ݶ�����Ų�ѯ���鲻�������������������ѡ�������������һ�����������ڵĶ����ţ�")
		public void test4() throws Exception {
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=//*[@id=\"deliverType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
	
		@Test(description="16.����������ѷ��������б�����ݶ������100000036��ѯ��������")
		public void test5() throws Exception {
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
		
		
		@Test(description="17.����������ѷ��������б�����ݶ�����Ų�ѯ���鲻�������������������ѡ�������������һ�����������ڵĶ����ţ�")
		public void test6() throws Exception {
			//��¼��̨
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
		
	
		@Test(description="18.���������ȡ��/���ն����б�����ݶ������100000003��ѯ��������")
		public void test7() throws Exception {
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
		
	
		@Test(description="19.���������ȡ��/���ն����б�����ݶ�����Ų�ѯ���鲻�������������������ѡ�������������һ�����������ڵĶ����ţ�")
		public void test8() throws Exception {
			//��¼��̨
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
}
