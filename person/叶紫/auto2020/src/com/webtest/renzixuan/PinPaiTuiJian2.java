package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class PinPaiTuiJian2 extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}
	
	@Test(description="30.Ʒ���Ƽ���ѡ����ߵ���Ʒ����Ȼ��������Ϊ��Ʒ���Ƿ���������")
	public void test1() throws Exception{
		//�����Ӫ����
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[2]");
		//�Ƽ�����
		Thread.sleep(2000);	
		webtest.click("link=�Ƽ�����");
		Thread.sleep(2000);	
		//���Ʒ���Ƽ�
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		Thread.sleep(2000);
		webtest.type("id=key_2","��Ϊ");
		Thread.sleep(2000);	
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		assertTrue(webtest.isTextPresent("����"));
	}
	
	
		@Test(description="31.Ʒ���Ƽ����Ƽ����ұ�ֱ�ӵ㱣��")
		public void test2() throws Exception{
			//���Ʒ���Ƽ�
			webtest.leaveFrame();
			webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
			webtest.enterFrame("wst-lframe-56");
			Thread.sleep(2000);
			webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
			webtest.type("id=key_2","��Ϊ");
			Thread.sleep(2000);	
			//�������
			webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
			Thread.sleep(2000);	
			webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
			assertTrue(webtest.isTextPresent("����"));
		}
		
		
	
		@Test(description="32.Ʒ���Ƽ�ѡ�����Ʒ�����ʵ�ʵ���Ʒ�����Ͽ��ܲ�����������")
		public void test3() throws Exception{
			//���Ʒ���Ƽ�
			webtest.leaveFrame();
			webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
			webtest.enterFrame("wst-lframe-56");
			webtest.click("xpath=//*[@id=\"cat12_0\"]/option[2]");
			webtest.type("id=key_2","��Ϊ");	
			//�������
			webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
			assertTrue(webtest.isTextPresent("����"));
		}
		
	
	@Test(description="33.�Ƽ����ұ߲�ѡ����Ʒ����ֱ�ӹ�ѡ��Ʒ�������")
	public void test4() throws Exception{
		webtest.leaveFrame();
		//���Ʒ���Ƽ�
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		webtest.type("id=key_2","��Ϊ");
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		//�����ߵĹ�ѡ��
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		//������ҵİ�ť
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
	    //����ұߵĹ�ѡ��
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[3]/div/div[1]/div[1]/input");
		//Ϊ��Ϊ���������Ϊ01
		webtest.type("xpath=//*[@id=\"rlist_2\"]/div[7]/div[3]/input","1");
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");	
		assertTrue(webtest.isTextPresent("����"));
	}
	

	@Test(description="34.�Ƽ����ұ�ѡ����Ʒ���൫�ǲ���ѡ��Ʒ�������")
	public void test5() throws Exception{
		webtest.leaveFrame();
		//���Ʒ���Ƽ�
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		//ѡ���ֻ�
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		webtest.type("id=key_2","��Ϊ");
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		//�����ߵĹ�ѡ��
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		//������ҵİ�ť
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
		//ѡ���ֻ�
		webtest.click("xpath=//*[@id=\"cat22_0\"]/option[8]");
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
		assertTrue(webtest.isTextPresent("����"));
	}
			
	
	@Test(description="35.�Ƽ����ұ߲�ѡ����Ʒ�������Ҳ����ѡ��Ʒ�������")
	public void test6() throws Exception{
		webtest.leaveFrame();
		//���Ʒ���Ƽ�
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		webtest.type("id=key_2","��Ϊ");
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		//�����ߵĹ�ѡ��
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		//������ҵİ�ť
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
		assertTrue(webtest.isTextPresent("����"));
	}
	
	
	@Test(description="36.��߲�ѡ������ֱ���ұ�ѡ����Ʒ����ѡ���ֻ��������")
	public void test7() throws Exception{
		webtest.leaveFrame();
		//���Ʒ���Ƽ�
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		//ѡ���ֻ�
		webtest.click("xpath=//*[@id=\"cat22_0\"]/option[8]");
	    //����ұߵĹ�ѡ��
		webtest.click("xpath=//*[@id=\"rlist_2\"]/div[7]/div[1]/input");	
		//Ϊ���������Ϊ1
		webtest.type("xpath=//*[@id=\"rlist_2\"]/div[7]/div[3]/input","2");
		//�������
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");	
		assertTrue(webtest.isTextPresent("����"));
	}
}
