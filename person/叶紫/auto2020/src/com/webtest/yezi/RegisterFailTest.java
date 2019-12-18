package com.webtest.yezi;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class RegisterFailTest extends BaseTest1{
	
	@BeforeMethod
	public void registerTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
	}
	
	//bug�����ˣ�Ӧʧ�ܵ��ɹ���
	@Test(description="015ʧ�ܵĲ�������-�û���λ��������λ")
	public void test15() throws Exception{
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "a123451bbbbbaaaa56780054321112345678901234567890");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
		assertFalse(webtest.isTextPresent("�˳�"));
	    Thread.sleep(3000);
		
	}
}
