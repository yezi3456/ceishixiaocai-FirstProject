package com.webtest.lizhe;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class StoreConfiguration  extends BaseTest{
	@Test(description="�޸ĵ�����ɫ����Ϊ��")
	public void test1() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=shopSlogan", "");
		webtest.click("xpath=//input[@value='����']");
		assertTrue(webtest.isTextPresent("������ɫ����"));
		webtest.leaveFrame();
	}
	@Test(description="�޸���ϵ�绰")
	public void test2() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=serviceTel", "13730556499");
		webtest.click("xpath=//input[@value='����']");
		assertTrue(webtest.isTextPresent("13730556499"));
		webtest.leaveFrame();
	}
	
	@Test(description="��������˺�")
	public void test3() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=����������");
		webtest.click("link=����");
		assertTrue(webtest.isTextPresent("�����˺�"));
		webtest.leaveFrame();
	}
	@Test(description="�޸�δ֧������ʧЧʱ��")
	public void test4() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=��Ӫ����");
		webtest.typeAndClear("id=autoCancelNoPayDays", "10");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("10"));
		webtest.leaveFrame();
	}
	@Test(description="�޸�Ĭ���˷�Ϊ��")
	public void test5() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=��Ӫ����");
		webtest.typeAndClear("id=defaultFreight", "");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("Ĭ���˷�"));
		webtest.leaveFrame();
	}
	@Test(description="�޸�Ĭ���˷�")
	public void test6() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=��Ӫ����");
		webtest.typeAndClear("id=defaultFreight", "10");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("10"));
		webtest.leaveFrame();
	}

	@Test(description="�޸��Զ��ջ�����")
	public void test7() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=��Ӫ����");
		webtest.typeAndClear("id=autoReceiveDays", "2");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("2"));
		webtest.leaveFrame();
	}
	@Test(description="�޸��Զ���������")
	public void test8() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=��Ӫ����");
		webtest.typeAndClear("id=autoAppraiseDays", "5");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("5"));
		webtest.leaveFrame();
	}

	@Test(description="�޸Ŀͷ�QQ")
	public void test9() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.typeAndClear("id=serviceQQ","123456");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='����']");
		assertTrue(webtest.isTextPresent("123456"));
		webtest.leaveFrame();
		}


//	@AfterMethod
//	public void exit(){
//		webtest.click("link=�˳�ϵͳ");	
//		webtest.click("link=ȷ��");
//		webtest.type("id=loginPwd","123456");
//		webtest.click("xpath=//input[@value='��¼']");
//	}
}
