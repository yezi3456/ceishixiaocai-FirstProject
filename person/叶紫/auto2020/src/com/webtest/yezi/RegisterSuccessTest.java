package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

public class RegisterSuccessTest extends BaseTest1{

	@Test(description="006ע��ɹ���������")
	public void test6() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
		webtest.click("link=���ע��"); 
		webtest.type("name=loginName", "yezi2abb098");
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
