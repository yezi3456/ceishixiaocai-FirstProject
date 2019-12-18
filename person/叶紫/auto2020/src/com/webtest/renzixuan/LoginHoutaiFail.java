package com.webtest.renzixuan;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;
import com.webtest.utils.ReadProperties;
@Listeners(com.webtest.core.WebTestListener.class)
public class LoginHoutaiFail extends BaseTest1{
	
	@Test(description="27.��̨��¼ʧ�ܣ��������")
	public void test1() throws Exception {
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�˳�ϵͳ"));
	}

	@Test(description="28.��̨��¼ʧ�ܣ��û�������")
	public void test2() throws Exception {
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName","1");
		webtest.type("id=loginPwd","yz290315");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		assertFalse(webtest.isTextPresent("�˳�ϵͳ"));
	}
}
