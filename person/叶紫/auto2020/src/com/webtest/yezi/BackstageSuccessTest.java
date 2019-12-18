package com.webtest.yezi;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class BackstageSuccessTest extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}
	
	@Test(description="044��ѯ��Ʒ�ɹ�")
	public void test44() throws Exception{
		webtest.click("xpath=//a[text()='��Ʒ����']");
		webtest.click("link=���۹���");
		webtest.enterFrame("wst-lframe-22");//����iframeҳ��
		webtest.type("id=goodsName", "ɰ�ǽ�");
		webtest.click("xpath=//input[@value='��ѯ']");
		assertTrue(webtest.isTextPresent("100000132"));
		assertTrue(webtest.isTextPresent("ɰ�ǽ�"));
		assertTrue(webtest.isTextPresent("very good"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
	
	
	
	@Test(description="045�޸���Ʒ���۵�״̬")
	public void test45() throws Exception{
		webtest.click("xpath=//a[text()='��Ʒ����']");
		webtest.click("link=���۹���");
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id='maingrid|2|r1001|c110']/div/a[1]");
		webtest.click("xpath=//input[@value='0']");
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("100000250"));
		assertTrue(webtest.isTextPresent("very good"));
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
	
	@Test(description="046�޸���Ʒ���۵�����")
	public void test46() throws Exception{
		webtest.click("xpath=//a[text()='��Ʒ����']");
		webtest.click("link=���۹���");
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id='maingrid|2|r1002|c110']/div/a[1]");
		webtest.type("id=content", "���������ʮ�ֺóԣ���ع��ģ���");
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("���������"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
	
	
	//bug�������ֳ��������޷�ɾ����Ӧ���гɹ���ʧ��
	@Test(description="047ɾ��ĳ����Ʒ����")
	public void test47() throws Exception{
		webtest.click("xpath=//a[text()='��Ʒ����']");
		webtest.click("link=���۹���");
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id='maingrid|2|r1053|c110']/div/a[2]");
		webtest.click("xpath=//*[@id='layui-layer1']/div[3]/a[1]");
		assertFalse(webtest.isTextPresent("�Ͱ���ر�"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
	

}
