package com.webtest.misiying;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class UserGoodsAddress6 extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
		webtest.click("link=���¼");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);

	}
	
	@Test(description="�����ջ���ַ��ÿһ���д��")
	public void test1() throws Exception {
		
		//��ȡ��������ַĿ¼
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		webtest.click("xpath=//*[@id=\"area_0\"]");
		webtest.click("xpath=//*[@id=\"area_0\"]/option[2]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]/option[2]");
		webtest.click("//*[@id=\"area_0_110000_110100\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]/option[2]");
		//������ϸ��ַ
		webtest.type("xpath=//*[@id=\"userAddress\"]","���Ϲ����ߺ�¥");
		Thread.sleep(2000);	
		webtest.type("xpath=//*[@id=\"userName\"]", "��Ůʿ");
		Thread.sleep(2000);	
		webtest.type("xpath=//*[@id=\"userPhone\"]","1332222222");
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��Ůʿ"));
	}
	
	
	@Test(description="�����ջ���ַ������ϵ��ʽ��")
	public void test2() throws Exception {		
		//��ȡ��������ַĿ¼
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		webtest.click("xpath=//*[@id=\"area_0\"]");
		webtest.click("xpath=//*[@id=\"area_0\"]/option[2]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]/option[2]");
		webtest.click("//*[@id=\"area_0_110000_110100\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]/option[2]");
		//������ϸ��ַ
		webtest.typeAndClear("userAddress","");
		webtest.type("xpath=//*[@id=\"userAddress\"]","���Ϲ����ߺ�¥");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]", "��Ůʿ");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userAddressForm","");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��Ůʿ"));
	}
	
	
	@Test(description="�����ջ���ַ����������")
	public void test3() throws Exception {
		//��ȡ��������ַĿ¼
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		webtest.click("xpath=//*[@id=\"area_0\"]");
		webtest.click("xpath=//*[@id=\"area_0\"]/option[2]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]/option[2]");
		webtest.click("//*[@id=\"area_0_110000_110100\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]/option[2]");
		//������ϸ��ַ
		webtest.typeAndClear("id=userAddress","");
		webtest.type("xpath=//*[@id=\"userAddress\"]","���Ϲ����ߺ�¥");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.type("xpath=//*[@id=\"userPhone\"]","1332222222");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userAddressForm","");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("���Ϲ���"));
	}
	
	
	@Test(description="�����ջ���ַ������ϸ��ַ��")
	public void test4() throws Exception {
		//��ȡ��������ַĿ¼
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		webtest.click("xpath=//*[@id=\"area_0\"]");
		webtest.click("xpath=//*[@id=\"area_0\"]/option[2]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000\"]/option[2]");
		webtest.click("//*[@id=\"area_0_110000_110100\"]");
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]/option[2]");
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]", "��Ůʿ");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userPhone","");
		webtest.type("xpath=//*[@id=\"userPhone\"]","1332222222");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=useraddressForm","");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��Ůʿ"));
	}
	
	
	@Test(description="�����ջ���ַ���޵�ַ����ѡ��")
	public void test5() throws Exception {
		//��ȡ��������ַĿ¼
		webtest.click("class=addrIcon");
		webtest.click("class=addr-btn");
		//������ϸ��ַ
		webtest.typeAndClear("id=area_0","");
		webtest.typeAndClear("id=userAddress","");
		webtest.type("xpath=//*[@id=\"userAddress\"]","���Ϲ����ߺ�¥");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]", "��Ůʿ");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=userPhone","");
		webtest.type("xpath=//*[@id=\"userPhone\"]","1332222222");
		Thread.sleep(2000);	
		webtest.typeAndClear("id=useraddressForm","");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/table/tbody/tr[5]/td/div/label[2]/label");
		webtest.click("xpath=//*[@id=\"useraddressForm\"]/div/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��Ůʿ"));
	}
	
	
	@Test(description="�޸�Ĭ�ϵ�ַ")
	public void test6() throws Exception {	
		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[1]/div[1]/a");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[1]");
		webtest.click("xpath=//*[@id=\"address_box\"]/table[2]/tbody/tr[6]/td[2]/a[1]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("Ĭ�ϵ�ַ"));
	}

}
