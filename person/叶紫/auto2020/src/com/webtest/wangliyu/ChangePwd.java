package com.webtest.wangliyu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ChangePwd extends BaseTest {

	@Test(priority=1,description="16�޸�����success")
	public void changepwd() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=�޸�����");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass2","123456");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�޸�����"));
	}
	
	
	@Test(priority=2,description="17�޸�����fail(ȷ�������������벻һ��)")
	public void changepwd2() throws Exception{
		
		Thread.sleep(3000);
		webtest.click("link=�޸�����");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass2","12345");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("ȷ�������������벻һ��"));
	}
	
	
	@Test(priority=3,description="18�޸�����fail(ȷ������Ϊ��)")
	public void changepwd3() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=�޸�����");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
//		webtest.type("id=newPass2","12345");
//		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("ȷ�����벻��Ϊ��"));
	}
	
	@Test(priority=4,description="19�޸�����fail(������Ϊ��)")
	public void changepwd4() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=�޸�����");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
//		webtest.type("id=newPass","123456");
//		Thread.sleep(3000);
		webtest.type("id=newPass2","123456");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�����벻��Ϊ��"));
	}
	
	@Test(priority=5,description="20�޸�����fail(ԭ����Ϊ��)")
	public void changepwd5() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=�޸�����");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
//		Thread.sleep(3000);
//		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass2","123456");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("ԭ���벻��Ϊ��"));
	}
	
	@Test(priority=6,description="21�޸�����fail(ԭ�������)")
	public void changepwd6() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=�޸�����");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123457");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass2","123456");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("ԭ����"));
	}
	
	@Test(priority=7,description="22�޸�����fail(������5λ)")
	public void changepwd7() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=�޸�����");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","12345");
		Thread.sleep(3000);
		webtest.type("id=newPass2","12345");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("ԭ����"));
	}
	
	@Test(priority=8,description="23�޸�����success(������Ϊ7λ)")
	public void changepwd8() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=�޸�����");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","1234567");
		Thread.sleep(3000);
		webtest.type("id=newPass2","1234567");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("�޸�����"));
	}
	
	@Test(priority=9,description="24�޸�����(������Ϊ20λ)")
	public void changepwd9() throws Exception{
//		Thread.sleep(3000);
//		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=�޸�����");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","1234567");
		Thread.sleep(3000);
		webtest.type("id=newPass","12345670000000000000");
		Thread.sleep(3000);
		webtest.type("id=newPass2","12345670000000000000");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�޸�����"));
	}
	

}
