package com.webtest.lizhe;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.core.BaseTestFail;

@Listeners(com.webtest.core.WebTestListener.class)
public class FailedAssertTest extends BaseTestFail{
	@Test(description="�޸ĵ�����ɫ���ܳ�����������")
	public void test1() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=shopSlogan", "���õ�B2C�����̵�ϵͳ����������������������������������������������������������������������������1");
		webtest.click("xpath=//input[@value='����']");
		assertTrue(webtest.isTextPresent("���õ�B2C�����̵�ϵͳ����������������������������������������������������������������������������1"));
		webtest.leaveFrame();
	}
	@Test(description="�޸��Զ���������С���Զ��ջ�ʱ��")
	public void test2() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=��Ӫ����");
		webtest.typeAndClear("id=autoReceiveDays", "2");
		webtest.typeAndClear("id=autoAppraiseDays", "1");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("�Զ���������С���Զ��ջ�ʱ���޸�ʧ��"));
		webtest.leaveFrame();
	}
	@Test(description="�޸�Ĭ���˷���ֵ����������")
	public void test3() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=��Ӫ����");
		webtest.typeAndClear("id=defaultFreight", "100000");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("Ĭ���˷���ֵ����������"));
		webtest.leaveFrame();
	}
	@Test(description="��֤���ü�")
	public void test4() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=shopSlogan", "wstshop��ɫ��վ");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='����']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("���õ�B2C�����̵�ϵͳ��"));
		webtest.leaveFrame();
	}
}
