package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class IsSalingSelect extends BaseTest{
	
	@Test(description="22��ѡ���κ��������в�ѯ")
	//22��ѡ���κ��������в�ѯ
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
	    Thread.sleep(2000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("��Ϊ"));
		webtest.leaveFrame();
	}
	
	@Test(description="23������Ʒ���ƽ��в�ѯ")
	//23������Ʒ���ƽ��в�ѯ
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
	    Thread.sleep(4000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"goodsName\"]","Xiaomi/С�� С��Max ��������6.44Ӣ�����ָ��ʶ����������ֻ�");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("С��"));
		webtest.leaveFrame();
	}
	
	@Test(description="24������Ʒ��Ž��в�ѯ")
	//24������Ʒ��Ž��в�ѯ
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
	    Thread.sleep(4000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"goodsName\"]","148280233673182");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("С��"));
		webtest.leaveFrame();
	}
}
