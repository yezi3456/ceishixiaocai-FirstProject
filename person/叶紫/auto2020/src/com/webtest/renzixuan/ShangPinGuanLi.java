package com.webtest.renzixuan;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class ShangPinGuanLi extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='��¼']");
		Thread.sleep(3000);
	}	
	
	@Test(description="37.��Ʒ����Ĳֿ���Ʒ���ݶ����Ų�ѯ(��ѡ����Ʒ����)")
	public void test1() throws Exception {
		//�����Ʒ����	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]");
		//����ֿ���Ʒ
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");	
		//���붩�����148280306147836
		webtest.enterFrame("wst-lframe-22");
		webtest.type("id=goodsName","148280306147836");
		//�����ѯ
		webtest.click("xpath=/html/body/div[1]/button");	
		assertTrue(webtest.isTextPresent("��ѯ"));
	}
	
	
		@Test(description="38.��Ʒ����Ĳֿ���Ʒ�����һ����Ʒ�ı༭������")
		public void test2() throws Exception {
			webtest.leaveFrame();
			//����ֿ���Ʒ
			webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");	
			webtest.enterFrame("wst-lframe-22");
			//����༭
			webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");	
			//�������
			webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");	
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
	
	
		@Test(description="39.��Ʒ����Ĳֿ���Ʒ�����һ����Ʒ��ɾ�������ȡ��")
		public void test3() throws Exception {
			webtest.leaveFrame();
			//����ֿ���Ʒ
			webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");
			webtest.enterFrame("wst-lframe-22");
			//���ɾ��
			webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[3]");	
			//���ȡ��
			webtest.click("xpath=//*[@id=\"layui-layer2\"]/div[3]/a[2]");	
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
	
	
	    @Test(description="40.��Ʒ����Ĳֿ���Ʒ���õ�һ����ƷΪ�Ƽ�")
		public void test4() throws Exception {
			webtest.leaveFrame();
			//����ֿ���Ʒ
			webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");
			webtest.enterFrame("wst-lframe-22");
			//�����һ����Ʒǰ��Ĺ�ѡ��
			webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");	
			//����Ƽ�
			webtest.click("xpath=/html/body/div[2]/button[2]");	
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
	 
	
	    @Test(description="41.��Ʒ����Ĳֿ���Ʒ�������������ѯ��ʱ��ˮ��-����ˮ��-���֣�")
		public void test5() throws Exception {
	    	webtest.leaveFrame();
			//����ֿ���Ʒ
			webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");	
			//ʱ��ˮ��-����ˮ��-����
			webtest.enterFrame("wst-lframe-22");
			webtest.click("xpath=//*[@id=\"cat_0\"]/option[2]");
			webtest.click("xpath=//*[@id=\"cat_0_47\"]/option[2]");
			webtest.click("xpath=//*[@id=\"cat_0_47_61\"]/option[2]");
			//�����ѯ
			webtest.click("xpath=/html/body/div[1]/button");	
			assertTrue(webtest.isTextPresent("��ѯ"));
		}
}
