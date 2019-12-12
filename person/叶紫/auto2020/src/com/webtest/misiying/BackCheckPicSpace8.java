package com.webtest.misiying;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class BackCheckPicSpace8 extends BaseTest1{
	
	String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-���̹��-ɾ��",priority=1)
	public void BackCheckPicSpace1() throws Exception {
		webtest.open(url);
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		
		//��ת����̨-ϵͳ����-ͼƬ�ռ�
		Thread.sleep(3000);	
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
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��Ʒ����-ɾ��",priority=2)
	public void BackCheckPicSpace2() throws Exception {
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
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-Ʒ��-ɾ��",priority=3)
	public void BackCheckPicSpace3() throws Exception {
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
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��Ʒ��Ϣ-ɾ��",priority=4)
	public void BackCheckPicSpace4() throws Exception {
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
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-�༭��-ɾ��",priority=5)
	public void BackCheckPicSpace5() throws Exception {
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
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��������-ɾ��",priority=6)
	public void BackCheckPicSpace6() throws Exception {
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
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��Ա�ȼ�-ɾ��",priority=7)
	public void BackCheckPicSpace7() throws Exception {
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
	
	
	@Test(description="��̨ϵͳ����-ͼƬ�ռ�-��Ա��Ϣ-ɾ��",priority=8)
	public void BackCheckPicSpace8() throws Exception {
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
