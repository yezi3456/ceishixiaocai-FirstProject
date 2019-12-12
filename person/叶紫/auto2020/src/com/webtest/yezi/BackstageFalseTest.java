package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

public class BackstageFalseTest extends BaseTest1{
	
	@BeforeMethod
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}
	
	
	@Test(description="048��ѯ��Ʒʧ��-���붩����")
	public void test48() throws Exception{
		webtest.click("xpath=//a[text()='��Ʒ����']");
		webtest.click("link=���۹���");
		webtest.enterFrame("wst-lframe-22");//����iframeҳ��
		webtest.type("id=goodsName", "100000250");
		webtest.click("xpath=//input[@value='��ѯ']");
		assertTrue(webtest.isTextPresent("100000250"));
		Thread.sleep(3000);
	}
	
	@Test(description="049��ѯ��Ʒʧ��-�����ַ�")
	public void test49() throws Exception{
		webtest.click("xpath=//a[text()='��Ʒ����']");
		webtest.click("link=���۹���");
		webtest.enterFrame("wst-lframe-22");//����iframeҳ��
		webtest.type("id=goodsName", "@��@��#��5");
		webtest.click("xpath=//input[@value='��ѯ']");
		assertTrue(webtest.isTextPresent("@��@��#��5"));
		Thread.sleep(3000);
	}
	
	@Test(description="050��ѯ��Ʒʧ��-������������")
	public void test50() throws Exception{
		webtest.click("xpath=//a[text()='��Ʒ����']");
		webtest.click("link=���۹���");
		webtest.enterFrame("wst-lframe-22");//����iframeҳ��
		webtest.type("id=goodsName", "very good");
		webtest.click("xpath=//input[@value='��ѯ']");
		assertTrue(webtest.isTextPresent("very good"));
		Thread.sleep(4000);
		driver.quit();
		
	}
}
