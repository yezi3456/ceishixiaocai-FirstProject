package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class AdManagement extends BaseTest{
	@Test(description="�޸�3 ��棨��ҳ�·�4���ĵ�һ��������ʱ���Ϊ2019-12-12")
	public void test1() throws Exception {
		webtest.click("link=������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1003|c110\"]/div/a[1]");
		webtest.typeAndClear("id=adEndDate", "2019-12-12");
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("2019-12-12"));
		webtest.leaveFrame();
	}
	@Test(description="��ѯPC�� ��ҳ�ֲ����")
	public void test3() throws Exception {
		webtest.click("link=������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("id=positionType");
		webtest.click("xpath=//*[@id=\"positionType\"]/option[2]");
		webtest.click("id=adPositionId");
		webtest.click("xpath=//*[@id=\"adPositionId\"]/option[2]");
		webtest.click("xpath=//input[@value='��ѯ']");
		assertTrue(webtest.isTextPresent("��ҳ�ֲ�1F�������"));
		webtest.leaveFrame();
	}

//	@Test(description="ɾ����һ����棨��ɾ����",priority=2)
//	public void delete() throws Exception {
//		webtest.click("link=������");
//		webtest.enterFrame("wst-lframe-1");
//		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
//		webtest.click("link=ȷ��");
//		assertFalse(webtest.isTextPresent("1����ɾ�����"));
//		webtest.leaveFrame();
//	}
}
