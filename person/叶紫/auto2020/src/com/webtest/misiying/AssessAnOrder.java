package com.webtest.misiying;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;

@Test
public class AssessAnOrder extends BaseTest1{
	
	String url="http://localhost/wstshop/home/index/index.html";
	
	@Test(description="�������ջ���Ʒ��ÿһ�д��",priority=1)
	public void AssessAnOrder1() throws Exception {
		
		webtest.open(url);
		webtest.click("link=���¼");
		webtest.type("id=loginName","misiying");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		
		//������Ʒ
		webtest.click("class=uc-order-icon4");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[3]/tr[3]/td[4]/div[1]/a");
		//����
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[1]/div[2]/div[1]/img[4]");
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[3]/div[2]/div[1]/img[3]");
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[5]/div[2]/div[1]/img[2]");
		//����
		webtest.type("xpath=//*[@id=\"content1\"]","�ǳ��ã��ǳ����������ó�!");
		//�ύ
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[10]/div[4]/div[3]/button");
		
		assertTrue(webtest.isTextPresent("�ǳ���"));
	}
	
	
	@Test(description="�������ջ���Ʒ�������֡�",priority=2)
	public void AssessAnOrder2() throws Exception {
		
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		//������Ʒ
		webtest.click("class=uc-order-icon4");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[4]/tr[3]/td[4]/div[1]/a");
		//����
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[1]/div[2]/div[1]/img[4]");
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[3]/div[2]/div[1]/img[3]");
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[5]/div[2]/div[1]/img[2]");

		//�ύ
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[10]/div[4]/div[3]/button");
		
		//assertTrue(webtest.isTextPresent("����"));
	}
	
	
	@Test(description="�����������ջ���Ʒ�������ǡ�",priority=3)
	public void AssessAnOrder3() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		//������Ʒ
		webtest.click("class=uc-order-icon4");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[5]/tr[3]/td[4]/div[1]/a");
		//����
		webtest.type("xpath=//*[@id=\"content1\"]","�ǳ��ã��ǳ����������ó�!");
		
		webtest.click("xpath=//*[@id=\"app-box1\"]/div[10]/div[4]/div[3]/button");
		
		//assertTrue(webtest.isTextPresent("�ύ����"));
	}
}


