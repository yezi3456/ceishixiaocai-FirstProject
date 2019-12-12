package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class CaiWuGuanLi  extends BaseTest1{
	String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(priority=2,description="1.����������������Ķ�����ѯ��ֻ��д���ֱ�ţ�")
	public void a() throws Exception {
		//��¼��̨
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
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
	

	@Test(priority=3,description="2.����������������Ķ�����ѯ��ֻ��д����״̬��")
	public void b() throws Exception {
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
	
		@Test(priority=4,description="3.����������������Ķ�����ѯ��ֻ��д����״̬��2")
		public void H() throws Exception {
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

	@Test(priority=5,description="4.����������������Ķ�����ѯ������д��1")
	public void c() throws Exception {
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
	
	@Test(priority=6,description="5.����������������Ķ�����ѯ��������д��ֱ�ӵ����ѯ")
	public void d() throws Exception {
		webtest.leaveFrame();
		//�����������
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//�����ѯ
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	@Test(priority=7,description="6.����������������Ķ�����ѯ������д��1")
	public void f() throws Exception {
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
