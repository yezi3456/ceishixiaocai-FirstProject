package com.webtest.renzixuan;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class ShangPinTuijian extends BaseTest1{
    String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(priority=1,description="42.��Ʒ�Ƽ�")
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
		//�����Ʒ�Ƽ�
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-56");
		Thread.sleep(2000);
		//����ֻ�
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		//����ֻ�
		webtest.click("xpath=//*[@id=\"cat12_0_334\"]/option[2]");
		//����ֻ�
		webtest.click("xpath=//*[@id=\"cat12_0_334_348\"]/option[2]");
		Thread.sleep(2000);	
		webtest.type("id=key_2","��Ϊ");
		Thread.sleep(2000);	
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[3]/div/div[1]/div[1]/input");
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"dataType_2\"]/option[3]");
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
		assertTrue(webtest.isTextPresent("����"));
	}
	

	
	@Test(priority=2,description="43.��Ʒ�Ƽ��ұ߲�ѡ����Ʒ����")
	public void b() throws Exception{
		webtest.leaveFrame();
		//�����Ʒ�Ƽ�
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-56");
		Thread.sleep(2000);	
		webtest.type("id=key_2","��Ϊ");
		Thread.sleep(2000);	
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		assertTrue(webtest.isTextPresent("����"));
	}
		
		

		@Test(priority=3,description="44.��Ʒ�Ƽ�ֱ�ӵ�����棬�������Ʒ")
		public void c() throws Exception{
			webtest.leaveFrame();
			//�����Ʒ�Ƽ�
			webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[1]");
			webtest.enterFrame("wst-lframe-56");
			webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
			assertFalse(webtest.isTextPresent("����"));
		}
		
	
}
