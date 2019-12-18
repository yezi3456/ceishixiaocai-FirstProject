package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class BlogRoll  extends BaseTest{
	@Test(description="��������")
	public void test1() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.type("id=friendlinkName", "��������1");
		webtest.runJs("arguments[0].setAttribute('class','webuploader-element-visible')","name=file");
		Thread.sleep(5000);
		webtest.type("name=file","E:\\picture\\tou.jpg");
		Thread.sleep(8000);
		webtest.type("id=friendlinkUrl", "https://www.baidu.com");
		webtest.type("id=friendlinkSort", "0");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("��������1"));
		webtest.leaveFrame();
	}
	@Test(description="�޸�WSTMall��̳����")
	public void test2() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1004|c105\"]/div/a[1]");
		webtest.typeAndClear("id=friendlinkUrl", "http://bbs.shangtao1.net");
		webtest.click("link=ȷ��");
		assertTrue(webtest.isTextPresent("http://bbs.shangtao1.net"));
		webtest.leaveFrame();
	}
	@Test(description="�����������ͼ��")
	public void test3() throws Exception {
		webtest.click("link=��������");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1004|c105\"]/div/a[1]");
		webtest.runJs("arguments[0].setAttribute('class','webuploader-element-visible')","name=file");
		Thread.sleep(5000);
		webtest.type("name=file","E:\\picture\\tou.jpg");
		Thread.sleep(8000);
		webtest.click("link=ȷ��");
		webtest.leaveFrame();
	}
//	@Test(description="ɾ����������1",priority=4)
//	public void delete() throws Exception {
//		webtest.click("link=��������");
//		webtest.enterFrame("wst-lframe-1");
//		webtest.click("xpath=//*[@id=\"maingrid|2|r1002|c105\"]/div/a[2]");
//		webtest.click("link=ȷ��");
//		assertFalse(webtest.isTextPresent("��������1"));
//		webtest.leaveFrame();
//	}
}











