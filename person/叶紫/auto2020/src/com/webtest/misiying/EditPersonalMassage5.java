package com.webtest.misiying;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class EditPersonalMassage5 extends BaseTest1{
	
	String url="http://localhost/wstshop/home/index/index.html";
	
	@Test(description="�༭�������ϡ�ÿһ���д��",priority=1)
	public void EditPersonalMassage1() throws Exception {
		webtest.open(url);
		webtest.click("link=���¼");
		webtest.type("id=loginName","misiying");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");

		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]","siying");
		webtest.typeAndClear("id=trueName","");
		webtest.type("xpath=//*[@id=\"trueName\"]","mimimi");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.type("xpath=//*[@id=\"brithday\"]","1999-01-10");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("xpath=//*[@id=\"userQQ\"]","1212121212");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		assertTrue(webtest.isTextPresent("����"));
	}
	
	
	@Test(description="�༭�������ϡ����ǳơ�",priority=2)
	public void EditPersonalMassage2() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		
		Thread.sleep(3000);
		webtest.typeAndClear("id=userName","");
		Thread.sleep(3000);
		webtest.typeAndClear("id=trueName","");
		webtest.type("xpath=//*[@id=\"trueName\"]","mimimi");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.type("xpath=//*[@id=\"brithday\"]","1979-01-10");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("xpath=//*[@id=\"userQQ\"]","12777799999");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		
		assertTrue(webtest.isTextPresent("�ǳ�"));
	}
	
	
	@Test(description="�༭�������ϡ�����ʵ������",priority=3)
	public void EditPersonalMassage3() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]","siying");
		webtest.typeAndClear("id=trueName","");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.type("xpath=//*[@id=\"brithday\"]","1999-01-10");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("xpath=//*[@id=\"userQQ\"]","1212121212");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		
		assertTrue(webtest.isTextPresent("�ǳ�"));
	}
	
	
	@Test(description="�༭�������ϡ����������ڡ�",priority=4)
	public void EditPersonalMassage4() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]","siying");
		webtest.typeAndClear("id=trueName","");
		webtest.type("xpath=//*[@id=\"trueName\"]","mimimi");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("xpath=//*[@id=\"userQQ\"]","1212121212");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		
		assertTrue(webtest.isTextPresent("�ǳ�"));
	}
	
	
	@Test(description="�༭�������ϡ���QQ�š�",priority=5)
	public void EditPersonalMassage5() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		Thread.sleep(3000);
		webtest.typeAndClear("id=userName","");
		Thread.sleep(3000);
		webtest.type("xpath=//*[@id=\"userName\"]","siying");
		webtest.typeAndClear("id=trueName","");
		webtest.type("xpath=//*[@id=\"trueName\"]","mimimi");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.type("xpath=//*[@id=\"brithday\"]","1999-01-10");
		Thread.sleep(3000);
		webtest.typeAndClear("id=userQQ","");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		
		assertTrue(webtest.isTextPresent("�ǳ�"));
	}
}

