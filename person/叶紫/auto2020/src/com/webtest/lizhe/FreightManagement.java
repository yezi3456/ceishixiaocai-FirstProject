package com.webtest.lizhe;

import static org.testng.Assert.assertTrue;

import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class FreightManagement  extends BaseTest{
	@Test(description="�޸�Ĭ���˷�Ϊ10")
	public void test1() throws Exception {
		webtest.click("link=�˷ѹ���");
		webtest.enterFrame("wst-lframe-1");
		webtest.type("id=key", "10");
		webtest.click("id=maingrid");
		assertTrue(webtest.isTextPresent("10"));
		webtest.leaveFrame();
	}
	@Test(description="˫�������޸ı����˷�Ϊ15")
	public void test2() throws Exception {
		webtest.click("link=�˷ѹ���");
		webtest.enterFrame("wst-lframe-1");
		webtest.doubleClick("xpath=//tr[starts-with(@id,'wst_tbody_')]/td[3]/div/span");
		Thread.sleep(5000);
		webtest.type("xpath=//tr[starts-with(@id,'wst_tbody_')]/td[3]/div/input", "15");
		webtest.click("id=maingrid");
		assertTrue(webtest.isTextPresent("15"));
		webtest.leaveFrame();
	}
	@Test(description="�޸Ľ���ʡ�˴����˷�Ϊ20")
	public void test3() throws Exception {
		webtest.click("link=�˷ѹ���");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//table[starts-with(@class,'l-grid-header-table wst-grid-tree')]/tr[2]/td[2]/div");
		webtest.doubleClick("xpath=//table[starts-with(@class,'l-grid-header-table wst-grid-tree')]/tr[4]/td[3]/div/span");
		Thread.sleep(5000);
		webtest.typeAndClear("xpath=//table[starts-with(@class,'l-grid-header-table wst-grid-tree')]/tr[4]/td[3]/div/input", "20");
		webtest.click("id=maingrid");
		assertTrue(webtest.isTextPresent("20"));
		webtest.leaveFrame();
	}
}
