package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class CaiWuGuanLi  extends BaseTest1{

	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}
	
	@Test(description="1.����������������Ķ�����ѯ��ֻ��д���ֱ�ţ�")
	public void test1() throws Exception {
		//�����Ӫ����
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[2]");
		//�������
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[3]/div[2]");
		//�����������
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//��д���ֱ��
		webtest.type("id=cashNo","100001");
		//�����ѯ
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	

	@Test(description="2.����������������Ķ�����ѯ��ֻ��д����״̬��")
	public void test2() throws Exception {
		webtest.leaveFrame();
		//�����������
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//��д����״̬(������)
		webtest.click("xpath=//*[@id=\"cashSatus\"]/option[2]");
		//�����ѯ
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
		@Test(description="3.����������������Ķ�����ѯ��ֻ��д����״̬��2")
		public void test3() throws Exception {
			webtest.leaveFrame();
			//�����������
			webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
			webtest.enterFrame("wst-lframe-56");
			//��д����״̬(��ͨ��)
			webtest.click("xpath=//*[@id=\"cashSatus\"]/option[3]");
			//�����ѯ
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("��ѯ"));
		}

	@Test(description="4.����������������Ķ�����ѯ������д��1")
	public void test4() throws Exception {
		webtest.leaveFrame();
		//�����������
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//��д���ֱ��
		webtest.type("id=cashNo","100001");
		//��д����״̬(������)
		webtest.click("xpath=//*[@id=\"cashSatus\"]/option[2]");
		//�����ѯ
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(description="5.����������������Ķ�����ѯ��������д��ֱ�ӵ����ѯ")
	public void test5() throws Exception {
		webtest.leaveFrame();
		//�����������
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//�����ѯ
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(description="6.����������������Ķ�����ѯ������д��1")
	public void test6() throws Exception {
		webtest.leaveFrame();
		//�����������
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//��д���ֱ��
		webtest.type("id=cashNo","100001");
		//��д����״̬(��ͨ��)
		webtest.click("xpath=//*[@id=\"cashSatus\"]/option[3]");
		//�����ѯ
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
}
