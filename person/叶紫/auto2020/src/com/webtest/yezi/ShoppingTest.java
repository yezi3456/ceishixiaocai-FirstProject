package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class ShoppingTest extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
		webtest.click("link=���¼");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);

	}
	
	@Test(description="016���㹺�ﳵ�������Ʒ")
	public void test16() throws Exception{
		webtest.click("xpath=//p[text()='���ﳵ']");
		webtest.switchWidow(1);//�������ҳ�棬��Ҫ�л�������ҳ��
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(2000);
		webtest.click("link=����");
		webtest.click("link=�ύ����");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�����ύ�ɹ�!"));
		Thread.sleep(2000);
//		webtest.switchWidow(1);
		driver.close();
		Thread.sleep(3000);
	}  
	
	@Test(description="017����ĳ����Ʒ������")
	public void test17() throws Exception{
		webtest.switchWidow(0);
		webtest.type("xpath=//input[@placeholder='��������Ʒ����']", "��ݮ");
		webtest.click("id=search-btn");
		webtest.click("link=��ݮ");
		webtest.switchWidow(1);
		webtest.click("link=��������");
		webtest.click("link=����");
		webtest.click("link=�ύ����");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�����ύ�ɹ�!"));
	}
	
	

}
