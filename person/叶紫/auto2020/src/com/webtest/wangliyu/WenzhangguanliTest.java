package com.webtest.wangliyu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class WenzhangguanliTest extends BaseTest {
	
	@Test(priority=1,description="25��������fail(��ѡ���������)")
	public void test1() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("link=���¹���");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/button[3]");
		Thread.sleep(3000);
		webtest.type("id=articleTitle","����");
		Thread.sleep(1000);
		webtest.type("id=articleKey","����");
		Thread.sleep(1000);
		webtest.type("xpath=/html/body/form/table/tbody/tr[5]/td/div/div[2]/iframe","������������������������������������");	
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[1]");
		assertTrue(webtest.isTextPresent("���·��಻��Ϊ��"));
		
		
	}
	

	@Test(priority=2,description="26ɾ������")
	public void test2() throws Exception{	
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[2]");		
		Thread.sleep(3000);
		webtest.click("link=ɾ��");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("����"));
	}
	
	@Test(priority=3,description="27�޸�����(�޸ı���)")
	public void test3() throws Exception{	
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[2]");		
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=articleTitle","");
		Thread.sleep(2000);
		webtest.type("id=articleTitle", "�޸��޸�");
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��Ʊ�ƶ�"));
	}
	
	@Test(priority=4,description="28�޸�����fail(�޸ĳ��ظ��ı���)")
	public void test4() throws Exception{	
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[2]");
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=articleTitle","");
		Thread.sleep(2000);
		webtest.type("id=articleTitle", "��˾ת��");
		webtest.click("xpath=//*[@id=\"articleForm\"]/table/tbody/tr[6]/td/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("����"));
	}
	
	@Test(priority=5,description="29����ɾ������")
	public void test5() throws Exception{	
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[2]");			
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[1]/div/input");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/button[2]");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("����"));
	}
	
	
}
