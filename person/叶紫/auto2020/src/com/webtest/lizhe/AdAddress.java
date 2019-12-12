package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AdAddress  extends BaseTest{
	@Test(description="�޸���ҳ�ֲ�1F�������λ�ô���Ϊads-1-1-1")
	public void test1() throws Exception {
		webtest.click("link=���λ��");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c108\"]/div/a[1]");
		webtest.typeAndClear("id=positionCode", "ads-1-1-1");
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("ads-1-1-1"));
		webtest.leaveFrame();
	}
	@Test(description="�������λ��")
	public void test2() throws Exception {
		webtest.click("link=���λ��");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.click("id=positionType");
		webtest.click("xpath=//*[@id=\"positionType\"]/option[2]");
		webtest.type("id=positionName", "newAddress2");
		webtest.type("id=positionCode", "n1");
		webtest.type("id=positionWidth", "100");
		webtest.type("id=positionHeight", "100");
		webtest.click("xpath=//input[@value='�ύ']");
		assertTrue(webtest.isTextPresent("newAddress2"));
		webtest.leaveFrame();
	}
	
	
//	@Test(description="ɾ��������ַnewAddress1",priority=3)
//	public void delete() throws Exception {
//		webtest.click("link=���λ��");
//		webtest.enterFrame("wst-lframe-1");
//		webtest.click("xpath=//*[@id=\"maingrid|2|r1024|c108\"]/div/a[2]");
//		webtest.click("link=ȷ��");
//		assertFalse(webtest.isTextPresent("newAddress2"));
//		webtest.leaveFrame();
//	}
}
