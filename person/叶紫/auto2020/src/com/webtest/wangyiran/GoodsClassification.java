package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class GoodsClassification extends BaseTest{

	@Test(description="56�ɹ��޸���Ʒ�Ƽ�")
	//56�޸���Ʒ�Ƽ�
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[6]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"f_377\"]");
		assertTrue(webtest.isTextPresent("���Ƽ�"));
		webtest.leaveFrame();
	}

	@Test(description="57�ɹ��޸���Ʒչʾ����")
	//57�޸���Ʒչʾ����
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[6]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"sh_377\"]");
		assertTrue(webtest.isTextPresent("��ʾ"));
		webtest.leaveFrame();
	}
	

}
