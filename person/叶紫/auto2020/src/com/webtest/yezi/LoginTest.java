package com.webtest.yezi;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class LoginTest extends BaseTest1{
	
	@Test(description="001�ɹ���¼��������",dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void test1(String username,String password) throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
		 if (webtest.isTextPresent("�˳�")) {
	            webtest.click("link=�˳�");
	        }
		webtest.click("link=���¼"); 
		webtest.type("name=loginName", username);
		webtest.type("name=loginPwd", password);
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�˳�"));
		Thread.sleep(3000);
		webtest.click("link=�˳�");
	}
	
	
	@Test(description="002�û�������")
	public void test2() throws Exception{
		webtest.click("link=���¼");
		webtest.type("name=loginName", "xiaofeifei11");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "AAA");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);
		assertFalse(webtest.isTextPresent("�˳�"));


	}
	
	@Test(description="003�������")
	public void test3() throws Exception{
		webtest.click("link=���¼");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz29031511");
		webtest.type("name=verifyCode", "AAA");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);
		assertFalse(webtest.isTextPresent("�˳�"));

	}
	
	@Test(description="004����ѡ��ס����")
	public void test4() throws Exception{
		webtest.click("link=���¼");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "AAA");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�˳�"));
		Thread.sleep(3000);
		webtest.click("link=�˳�");
	}
	
	@Test(description="005��֤��Ϊ��")
	public void test5() throws Exception{
		webtest.click("link=���¼");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);
		assertFalse(webtest.isTextPresent("�˳�"));
	}
	
	

}
