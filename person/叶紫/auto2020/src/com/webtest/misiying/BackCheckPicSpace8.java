package com.webtest.misiying;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class BackCheckPicSpace8 extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-���̹��-ɾ��")
	public void test1() throws Exception {
		
		//��ת����̨-ϵͳ����-ͼƬ�ռ�
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//���̹��
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[1]/td[5]/a");
		//ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");	
		
		assertTrue(webtest.isTextPresent("ɾ��"));
	}
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��Ʒ����-ɾ��")
	public void test2() throws Exception {
		webtest.leaveFrame();
		
		//��ת����̨-ϵͳ����-ͼƬ�ռ�
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//��Ʒ����
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[2]/td[5]/a");
		//ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("ɾ��"));
	}
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-Ʒ��-ɾ��")
	public void test3() throws Exception {
		webtest.leaveFrame();
		
		//��ת����̨-ϵͳ����-ͼƬ�ռ�
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//Ʒ��
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[3]/td[5]/a");
		//ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("ɾ��"));
	}
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��Ʒ��Ϣ-ɾ��")
	public void test4() throws Exception {
		webtest.leaveFrame();
		
		//��ת����̨-ϵͳ����-ͼƬ�ռ�
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//��Ʒ��Ϣ
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[4]/td[5]/a");
		//ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("ɾ��"));
	}
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-�༭��-ɾ��")
	public void test5() throws Exception {
		webtest.leaveFrame();
		
		//��ת����̨-ϵͳ����-ͼƬ�ռ�
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//�༭��
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[5]/td[5]/a");
		//ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("ɾ��"));
	}
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��������-ɾ��")
	public void test6() throws Exception {
		webtest.leaveFrame();
		
		//��ת����̨-ϵͳ����-ͼƬ�ռ�
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//��������
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[6]/td[5]/a");
		//ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("ɾ��"));
	}
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��Ա�ȼ�-ɾ��")
	public void test7() throws Exception {
		webtest.leaveFrame();
		
		//��ת����̨-ϵͳ����-ͼƬ�ռ�
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//��Ա�ȼ�
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[7]/td[5]/a");
		//ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("ɾ��"));
	}
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��Ա��Ϣ-ɾ��")
	public void test8() throws Exception {
		webtest.leaveFrame();
		
		//��ת����̨-ϵͳ����-ͼƬ�ռ�
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//��Ա��Ϣ
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[8]/td[5]/a");
		//ɾ��
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("ɾ��"));
	}
}
