package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//�޸ĺ�̨��¼����
public class ChangePassword extends BaseTest{
	@Test(description="�޸ĺ�̨��¼���벻����ȷ������")
	public void test1() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.type("id=srcPass", "yz290315");
		webtest.type("id=newPass","111111");
		webtest.type("id=newPass2","");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("ȷ�����벻��Ϊ��"));
		webtest.click("link=ȡ��");
		webtest.leaveFrame();
	}
	@Test(description="�޸ĺ�̨��¼����Ϊ111111")
	public void test2() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.typeAndClear("id=srcPass", "yz290315");
		webtest.typeAndClear("id=newPass","111111");
		webtest.typeAndClear("id=newPass2","111111");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("admin"));
		webtest.leaveFrame();
	}
	@Test(description="�޸ĺ�̨��¼����Ϊ123456")
	public void test3() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.typeAndClear("id=srcPass", "111111");
		webtest.typeAndClear("id=newPass","yz290315");
		webtest.typeAndClear("id=newPass2","yz290315");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("admin"));
		webtest.leaveFrame();
	}
	@Test(description="�޸ĺ�̨��¼����ȷ�������������벻һ��")
	public void test4() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.typeAndClear("id=srcPass", "yz290315");
		webtest.typeAndClear("id=newPass","111111");
		webtest.typeAndClear("id=newPass2","111222");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("ȷ�������������벻һ��"));
		webtest.click("link=ȡ��");
		webtest.leaveFrame();
	}
	@Test(description="�޸ĺ�̨��¼����������Ϊ��")
	public void test5() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.typeAndClear("id=srcPass", "yz290315");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","111111");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("�����벻��Ϊ��"));
	}
}
