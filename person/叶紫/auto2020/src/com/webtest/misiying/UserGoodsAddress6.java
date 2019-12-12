package com.webtest.misiying;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class UserGoodsAddress6 extends BaseTest1{
	
	String url="http://localhost/wstshop/home/index/index.html";
	
	@Test(description="�����ջ���ַ��ÿһ���д��",priority=1)
	public void AddAddress1() throws Exception {
		//����ҳ
		webtest.open(url);
		webtest.click("link=���¼");
		webtest.type("id=loginName","misiying");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		
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
	
	
	@Test(description="�����ջ���ַ������ϵ��ʽ��",priority=2)
	public void AddAddress2() throws Exception {		
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
	
	
	@Test(description="�����ջ���ַ����������",priority=3)
	public void AddAddress3() throws Exception {
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
	
	
	@Test(description="�����ջ���ַ������ϸ��ַ��",priority=4)
	public void AddAddress4() throws Exception {
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
	
	
	@Test(description="�����ջ���ַ���޵�ַ����ѡ��",priority=5)
	public void AddAddress5() throws Exception {
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
	
	
	@Test(description="�޸�Ĭ�ϵ�ַ",priority=6)
	public void ChangeDefaultAddredd() throws Exception {	
		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[1]/div[1]/a");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[1]");
		webtest.click("xpath=//*[@id=\"address_box\"]/table[2]/tbody/tr[6]/td[2]/a[1]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("Ĭ�ϵ�ַ"));
	}

}
