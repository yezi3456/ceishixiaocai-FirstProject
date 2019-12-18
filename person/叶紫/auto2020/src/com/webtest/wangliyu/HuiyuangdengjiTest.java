package com.webtest.wangliyu;

import static org.testng.Assert.assertFalse;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.TxtDataProvider;
@Listeners(com.webtest.core.WebTestListener.class)
public class HuiyuangdengjiTest extends BaseTest{

	

	@Test(description="03ɾ����Ա")
	public void test1() throws Exception{
		Thread.sleep(3000);
//		webtest.click("xpath=*[@id=\"wst-accordion-1\"]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=��Ա�ȼ�");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("link=ɾ��");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("�ۿ���"));
	}

	
	@Test(description="05�޸Ļ�Ա")
	public void test2() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=rankName","");
		Thread.sleep(2000);
		webtest.type("id=rankName","VIP");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("VIP"));
	}
	
	@Test(description="04������Աfail(���ϴ�ͼ��)")
	public void test3() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/button");
		Thread.sleep(2000);
		webtest.type("id=rankName","VIP");
		Thread.sleep(2000);
		webtest.type("id=startScore","100");
		Thread.sleep(2000);
		webtest.type("id=endScore","1000");
		Thread.sleep(2000);
		webtest.type("id=rebate","10");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("Ԥ��ͼ"));

	}
	
	
	@Test(description="47�޸Ļ�Ա-��������С�ڻ�������fail")
	public void test4() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userRankForm\"]/table/tbody/tr[7]/td/input[3]");
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=startScore","");
		Thread.sleep(2000);
		webtest.typeAndClear("id=endScore","");
		Thread.sleep(2000);
		webtest.type("id=startScore","1000000");
		Thread.sleep(2000);
		webtest.type("id=endScore","100");
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/form/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("Ԥ��ͼ"));
	}
	
	@Test(description="48�޸Ļ�Ա-��������Ϊ�ַ�fail")
	public void test5() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=��Ա�ȼ�");
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=startScore","");
		Thread.sleep(2000);
		webtest.type("id=startScore","aaa");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("Ԥ��ͼ"));
	}
	
	@Test(description="49�޸Ļ�Ա-�ۿ���Ϊ1000�����ύ")
	public void test6() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=��Ա�ȼ�");
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=startScore","");
		webtest.typeAndClear("id=endScore","");
		webtest.typeAndClear("id=rebate","");
		Thread.sleep(2000);
		webtest.type("id=startScore","10");
		webtest.type("id=endScore","100");
		webtest.type("id=rebate","10000");
		Thread.sleep(2000);
		assertFalse(webtest.isTextPresent("10000"));
	}
	
	@Test(description="50ˢ�°�ť")
	public void test7() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userRankForm\"]/table/tbody/tr[7]/td/input[3]");
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[10]/div/span");
		Thread.sleep(2000);
		
	}
	
	

}
