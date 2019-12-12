package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

public class AddressTest extends BaseTest1{
	
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
	
	@Test(description="018������ַ�ɹ�")
	public void test18() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='�����ջ���ַ']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "�϶�����·20��");
		webtest.type("id=userName", "С�ɷ�");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' ��']");
		webtest.click("xpath=//button[text()='�ύ']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("С�ɷ�"));
	}
	
	@Test(description="019ʧ�ܲ�������-��ϸ��ַΪ��")
	public void test19() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='�����ջ���ַ']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "");
		webtest.type("id=userName", "ССС");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' ��']");
		webtest.click("xpath=//button[text()='�ύ']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("ССС"));
	}
	
	@Test(description="020ʧ�ܲ�������-��ϵ����Ϊ��")
	public void test20() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='�����ջ���ַ']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "��·20��");
		webtest.type("id=userName", "");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' ��']");
		webtest.click("xpath=//button[text()='�ύ']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��·20��"));
	}
	
	@Test(description="021ʧ�ܲ�������-��ϵ�绰Ϊ��")
	public void test21() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='�����ջ���ַ']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "�϶�����·20��");
		webtest.type("id=userName", "ССС");
		webtest.type("id=userPhone", "");
		webtest.click("xpath=//label[text()=' ��']");
		webtest.click("xpath=//button[text()='�ύ']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("ССС"));
	}
	
	@Test(description="022ʧ�ܲ�������-����Ϊ��")
	public void test22() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='�����ջ���ַ']");
		webtest.type("id=userAddress", "�϶�����·20��");
		webtest.type("id=userName", "ССС");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' ��']");
		webtest.click("xpath=//button[text()='�ύ']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("ССС"));
	}
	
	//bug�ֳ�������Ӧʧ�ܵ��ɹ���
	@Test(description="023ʧ�ܲ�������-��ϸ��ַ����Ƿ��ַ�����ĸ")
	public void test23() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='�����ջ���ַ']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "aaaa@@@������");
		webtest.type("id=userName", "���");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' ��']");
		webtest.click("xpath=//button[text()='�ύ']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("���"));
	}
	
	
	
	
	@Test(description="024����ҵĵ�ַ")
	public void test24() throws Exception{
		webtest.click("xpath=//p[text()='�ҵ��ջ���ַ']");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�����ջ���ַ"));
	}
	

}
