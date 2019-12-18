package com.webtest.misiying;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class IntegralManage9 extends BaseTest1{
	
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
	
	@Test(description="�鿴������ϸ")
	public void test1() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//���ֹ���
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		assertTrue(webtest.isTextPresent("��Ʒ����"));
	}
	
	
	@Test(description="�鿴��������")
	public void test2() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//���ֹ���
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		//��������
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		assertTrue(webtest.isTextPresent("���׶���"));
	}
	
	
	@Test(description="�鿴����֧��")
	public void test3() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//���ֹ���
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		//����֧��
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[3]");
		assertTrue(webtest.isTextPresent("���ֱ仯"));
	}
	
	
	@Test(description="�鿴�ʽ���ˮ")
	public void test4() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//�ʽ���ˮ
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		assertTrue(webtest.isTextPresent("��Դ"));
	}
	
	
	@Test(description="�鿴�ʽ�����")
	public void test5() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//�ʽ���ˮ
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		//�ʽ�����
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		assertTrue(webtest.isTextPresent("���"));
	}
	
	
	@Test(description="�鿴�ʽ�֧��")
	public void test6() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//�ʽ���ˮ
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		//�ʽ�֧��
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[3]");
		assertTrue(webtest.isTextPresent("����"));
	}
	
	
	@Test(description="�����û����п�����Ϣ")
	public void test7() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		//����
		webtest.click("xpath=//*[@id=\"tab\"]/div/div[2]/div/button");
    	webtest.click("xpath=//*[@id=\"accTargetId\"]");
    	webtest.click("xpath=//*[@id=\"accTargetId\"]/option[2]");
    	webtest.click("xpath=//*[@id=\"area_0\"]");
    	webtest.click("xpath=//*[@id=\"area_0\"]/option[3]");
    	webtest.click("xpath=//*[@id=\"area_0_360000\"]");
    	webtest.click("xpath=//*[@id=\"area_0_360000\"]/option[4]");
    	webtest.click("xpath=//*[@id=\"area_0_360000_360300\"]");
    	webtest.click("xpath=//*[@id=\"area_0_360000_360300\"]/option[3]");
    	webtest.type("xpath=//*[@id=\"accNo\"]","11113335672423");
    	webtest.type("xpath=//*[@id=\"accUser\"]","����");
    	webtest.type("xpath=//*[@id=\"payPwd\"]","123456");
    	//����
    	webtest.click("xpath=//*[@id=\"configForm\"]/table/tbody/tr[6]/td/button[1]");
//    	assertTrue(webtest.isTextPresent("����ʡ"));
	}
	
	
	@Test(description="�޸��û����п�����Ϣ")
	public void test8() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		//�༭
		webtest.click("xpath=//*[@id=\"config-page-list\"]/tr[1]/td[5]/a[1]");
		//������Ϣ
    	webtest.click("xpath=//*[@id=\"accTargetId\"]");
    	webtest.click("xpath=//*[@id=\"accTargetId\"]/option[8]");
    	//������Ϣ
    	webtest.typeAndClear("id=accNo","");
    	webtest.type("xpath=//*[@id=\"accNo\"]","1111331111117777777");
    	//֧������
    	webtest.type("xpath=//*[@id=\"payPwd\"]","123456");
    	//����
    	webtest.click("xpath=//*[@id=\"configForm\"]/table/tbody/tr[6]/td/button[1]");
//    	assertTrue(webtest.isTextPresent("��ҵ����"));
	}
	
	
	@Test(description="ɾ���û����п�����Ϣ")
	public void test9() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		//ɾ��
		webtest.click("xpath=//*[@id=\"config-page-list\"]/tr[1]/td[5]/a[2]");
		//ȷ��ɾ��
    	webtest.click("xpath=//*[@id=\"layui-layer3\"]/div[3]/a[1]");
//    	assertFalse(webtest.isTextPresent("��ҵ����"));
	}
}
