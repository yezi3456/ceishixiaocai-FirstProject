package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class PinPaiTuiJian extends BaseTest1{
	String url="http://localhost/wstshop/admin/index/login.html";
	
	//11.Ʒ���Ƽ�
	@Test(priority=2,description="29.Ʒ���Ƽ�")
	public void a() throws Exception{
		//��¼��̨
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		assertTrue(webtest.isTextPresent("�˳�ϵͳ"));
		//�����Ӫ����
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[2]");
		//�Ƽ�����
		Thread.sleep(2000);	
		webtest.click("link=�Ƽ�����");
		Thread.sleep(2000);	
		//���Ʒ���Ƽ�
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		webtest.type("id=key_2","��Ϊ");
		Thread.sleep(2000);	
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		Thread.sleep(2000);	
		//�����ߵĹ�ѡ��
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		Thread.sleep(2000);	
		//������ҵİ�ť
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
		//ѡ���ֻ�
		webtest.click("xpath=//*[@id=\"cat22_0\"]/option[8]");
		Thread.sleep(2000);	
	    //����ұߵĹ�ѡ�򣨻�Ϊ��
		webtest.click("xpath=//*[@id=\"rlist_2\"]/div[7]/div[1]/input");
		Thread.sleep(2000);	
		//Ϊ��Ϊ���������Ϊ01
		webtest.type("xpath=//*[@id=\"rlist_2\"]/div[7]/div[3]/input","1");
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
		assertTrue(webtest.isTextPresent("����"));
	}
	
}
