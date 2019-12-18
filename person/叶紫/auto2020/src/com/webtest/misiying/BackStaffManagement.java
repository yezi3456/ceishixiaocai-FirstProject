package com.webtest.misiying;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class BackStaffManagement extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}
	
	@Test(description="��̨ϵͳ����-ְԱ����-����ְԱ")
	public void test1() throws Exception {
		
		webtest.click("xpath=//*[@id='wst-accordion-1']/div[7]/div[2]");
		webtest.click("link=ְԱ����");
		webtest.enterFrame("wst-lframe-1");
	    webtest.click("xpath=/html/body/div[1]/button[2]");	
	    webtest.type("id=loginName","xiaofeifei");
	    webtest.type("id=loginPwd","yz290315");
	    webtest.type("id=staffName","С�ɷ�");
	    webtest.type("id=staffNo","001");
	    webtest.click("xpath=/html/body/form/table/tbody/tr[8]/td/input[1]");
		assertTrue(webtest.isTextPresent("С�ɷ�"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);

	}
	
	@Test(description="��̨ϵͳ����-ְԱ����-����ְԱ")
	public void test2() throws Exception {
		
		webtest.click("xpath=//*[@id='wst-accordion-1']/div[7]/div[2]");
		webtest.click("link=ְԱ����");
		webtest.enterFrame("wst-lframe-1");

		webtest.type("id=key", "��Ʒ����Ա");	
	    webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("��Ʒ����Ա"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
		

	}
	
	@Test(description="��̨ϵͳ����-ְԱ����-ɾ��ְԱ")
	public void test3() throws Exception {
		
		webtest.click("xpath=//*[@id='wst-accordion-1']/div[7]/div[2]");
		webtest.click("link=ְԱ����");
		webtest.enterFrame("wst-lframe-1");

	    webtest.click("xpath=//*[@id='maingrid|2|r1001|c109']/div/a[3]");
	    webtest.click("xpath=//*[@id='layui-layer1']/div[3]/a[1]");
		assertFalse(webtest.isTextPresent("С�ɷ�"));
		

	}

}
