package com.webtest.yezi;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

public class CommodityTest extends BaseTest1{
	
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
	
	@Test(description="035����ҳ��������Ʒ���鿴����ҳ")
	public void test35() throws Exception{
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("xpath=//img[@title='�����۱����Ļ�����2.5kg�۱����Ļ������Ƿǳ��ܻ�ӭ�Ľ���ˮ��֮һ']");
		webtest.switchWidow(1);
		webtest.click("xpath=//*[@id='tab']/ul/li[2]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id='tab']/ul/li[3]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		assertTrue(webtest.isTextPresent("�����۱����Ļ�����2.5kg�۱����Ļ������Ƿǳ��ܻ�ӭ�Ľ���ˮ��֮һ"));
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="036��������������Ʒ���鿴����ҳ")
	public void test36() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=��ӭ����aaaa");
		webtest.type("id=search-ipt", "��ݮ");
		webtest.click("id=search-btn");
		webtest.click("link=��ݮ");
		webtest.switchWidow(1);
		webtest.click("xpath=//*[@id='tab']/ul/li[3]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		assertTrue(webtest.isTextPresent("��ݮ"));
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="037����ҳ��������Ʒ����ע")
	public void test37() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=��ӭ����aaaa");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("xpath=//img[@title='ɰ�ǽ�']");
		webtest.switchWidow(1);
		webtest.click("link=��ע��Ʒ");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("�ѹ�ע"));
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="038��������������Ʒ����ע")
	public void test38() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=��ӭ����aaaa");
		webtest.type("id=search-ipt", "������");
		webtest.click("id=search-btn");
		webtest.click("xpath=//img[@title='���Ⲥ���� 1��Լ300g']");
		webtest.switchWidow(1);
		webtest.click("link=��ע��Ʒ");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("�ѹ�ע"));
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="039����ҳ��������Ʒ�����빺�ﳵ")
	public void test39() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=��ӭ����aaaa");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("xpath=//img[@title='ɰ�ǽ�']");
		webtest.switchWidow(1);
		webtest.click("link=���빺�ﳵ");
		webtest.click("xpath=//*[@id='wst-nav-items']/a");
		assertTrue(webtest.isTextPresent("ɰ�ǽ�"));
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="040��������������Ʒ�����빺�ﳵ")
	public void test40() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=��ӭ����aaaa");
		webtest.type("id=search-ipt", "������");
		webtest.click("id=search-btn");
		webtest.click("xpath=//img[@title='���Ⲥ���� 1��Լ300g']");
		webtest.switchWidow(1);
		webtest.click("link=���빺�ﳵ");
		webtest.click("xpath=//*[@id='wst-nav-items']/a");
		assertTrue(webtest.isTextPresent("������"));
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="041�鿴���ﳵ�������Ʒ")
	public void test41() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=��ӭ����aaaa");
		webtest.click("xpath=//p[text()='���ﳵ']");
		webtest.switchWidow(1);
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(2000);	
		assertTrue(webtest.isTextPresent("�ҵĹ��ﳵ"));
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
	}

	@Test(description="042�鿴����")
	public void test42() throws Exception{
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(2000);	
		assertTrue(webtest.isTextPresent("������ϸ"));
		Thread.sleep(3000);
	}
	
	//bug�������ֳ�������Ӧ�����гɹ�����ʧ��
	@Test(description="043��ĳ����Ʒȡ����ע")
	public void test43() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=��ӭ����aaaa");
		webtest.click("xpath=/html/body/div[1]/div/ul[2]/li[3]");
		webtest.click("xpath=//img[@title='ɰ�ǽ�']");
		webtest.switchWidow(1);
		webtest.click("link=�ѹ�ע");
		webtest.click("xpath=/html/body/div[1]/div/ul[2]/li[3]");
		assertFalse(webtest.isTextPresent("ɰ�ǽ�"));
		Thread.sleep(4000);	
		driver.quit();
	
	}
	
//	@Test(description="044�����ﳵ�����ĳһ����Ʒɾ��")
//	public void test44() throws Exception{
//		webtest.switchWidow(0);
//		webtest.click("xpath=//p[text()='���ﳵ']");
//		webtest.switchWidow(1);
//		webtest.click("xpath=/html/body/div[6]/div[5]/div[2]/div/div[2]/div[6]/a");
//		webtest.click("xpath=//*[@id='layui-layer1']/div[3]/a[1]");
//		Thread.sleep(2000);
//		assertFalse(webtest.isTextPresent("������"));
//		driver.close();
//		Thread.sleep(3000);
//	}
	
	
//	@Test(description="041�����ﳵ�����ĳһ����Ʒ���ӹ�������")
//	public void test41() throws Exception{
//		webtest.switchWidow(0);
////		webtest.click("link=��ӭ����aaaa");
//		webtest.click("xpath=//p[text()='���ﳵ']");
//		webtest.switchWidow(1);
//		webtest.click("id=buy-add_70");
//		webtest.click("id=buy-add_70");
//		Thread.sleep(2000);	
//		assertTrue(webtest.isTextPresent("180"));
//		Thread.sleep(3000);
//		driver.close();
//		Thread.sleep(3000);
//	}


}
