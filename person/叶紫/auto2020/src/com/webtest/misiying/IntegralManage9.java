package com.webtest.misiying;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class IntegralManage9 extends BaseTest1{
	
	String url="http://localhost/wstshop/home/index/index.html";
	
	@Test(description="�鿴������ϸ",priority=1)
	public void Integral1() throws Exception {
		webtest.open(url);
		webtest.click("link=���¼");
		webtest.type("id=loginName","misiying");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");

		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//���ֹ���
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		assertTrue(webtest.isTextPresent("��Ʒ����"));
	}
	
	
	@Test(description="�鿴��������",priority=2)
	public void Integral2() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//���ֹ���
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		//��������
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		assertTrue(webtest.isTextPresent("���׶���"));
	}
	
	
	@Test(description="�鿴����֧��",priority=3)
	public void Integral3() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//���ֹ���
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		//����֧��
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[3]");
		assertTrue(webtest.isTextPresent("���ֱ仯"));
	}
	
	
	@Test(description="�鿴�ʽ���ˮ",priority=4)
	public void MoneyTrans1() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//�ʽ���ˮ
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		assertTrue(webtest.isTextPresent("��Դ"));
	}
	
	
	@Test(description="�鿴�ʽ�����",priority=5)
	public void MoneyTrans2() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//�ʽ���ˮ
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		//�ʽ�����
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		assertTrue(webtest.isTextPresent("���"));
	}
	
	
	@Test(description="�鿴�ʽ�֧��",priority=6)
	public void MoneyTrans3() throws Exception {
		//�ʽ����
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//�ʽ���ˮ
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		//�ʽ�֧��
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[3]");
		assertTrue(webtest.isTextPresent("����"));
	}
	
	
	@Test(description="�����û����п�����Ϣ",priority=7)
	public void EditBankCard1() throws Exception {
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
	
	
	@Test(description="�޸��û����п�����Ϣ",priority=8)
	public void EditBankCard2() throws Exception {
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
	
	
	@Test(description="ɾ���û����п�����Ϣ",priority=9)
	public void EditBankCard3() throws Exception {
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
