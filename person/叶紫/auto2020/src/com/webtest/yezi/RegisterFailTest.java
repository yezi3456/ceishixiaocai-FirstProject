package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

public class RegisterFailTest extends BaseTest1{
	
	@BeforeMethod
	public void registerTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
	}
	
	@Test(description="007ʧ�ܲ�������-����λ��С��6")
	public void test7() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz123");
		webtest.type("name=reUserPwd", "yz123");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("�˳�"));
	    Thread.sleep(2000);

	}
	
	@Test(description="008ʧ�ܲ�������-����λ������16")
	public void test8() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz1234567890123456789");
		webtest.type("name=reUserPwd", "yz1234567890123456789");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("�˳�"));
	    Thread.sleep(2000);

	}
	
	@Test(description="009ʧ�ܲ�������-ȷ�����������벻һ��")
	public void test9() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz123491");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("�˳�"));
	    Thread.sleep(2000);
	}
	
	@Test(description="010ʧ�ܲ�������-��֤��Ϊ��")
	public void test10() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("�˳�"));
	    Thread.sleep(2000);
	}
	
	@Test(description="011ʧ�ܲ�������-����ѡЭ��")
	public void test11() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("�˳�"));
	    Thread.sleep(2000);
	}
	
	@Test(description="012ʧ�ܵĲ�������-�û��������ֿ�ͷ")
	public void test12() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "112");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("�˳�"));
	    Thread.sleep(2000);
	}
	
	@Test(description="013ʧ�ܵĲ�������-�û������ַ���ͷ")
	public void test13() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "@@@aaas");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("�˳�"));
	    Thread.sleep(2000);
	}
	
	@Test(description="014ʧ�ܵĲ�������-�û���λ��С����λ")
	public void test14() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "aaa");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("�˳�"));
	    Thread.sleep(2000);
	}
	
	//bug�����ˣ�Ӧʧ�ܵ��ɹ���
	@Test(description="015ʧ�ܵĲ�������-�û���λ��������λ")
	public void test15() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "a123451aaaaaa56787654321112345678901234567890");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("�˳�"));
	    Thread.sleep(3000);
		webtest.click("link=�˳�");
		Thread.sleep(2000);
	}
}
