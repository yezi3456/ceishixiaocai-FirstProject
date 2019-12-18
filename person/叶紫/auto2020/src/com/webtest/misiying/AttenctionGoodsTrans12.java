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
public class AttenctionGoodsTrans12 extends BaseTest1{
	
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
	
	@Test(description="�鿴��ע����Ʒ")
	public void test1() throws Exception {
		//�鿴��ע����Ʒ
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[2]/li");
		
		assertTrue(webtest.isTextPresent("���빺�ﳵ"));
	}
	
	
	@Test(description="�鿴��������Ʒ����")
	public void test2() throws Exception {
		
		//�����������Ʒҳ��
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		Thread.sleep(3000);
		webtest.click("class=uc-order-icon2");
		Thread.sleep(3000);
		webtest.click("class=orderDetail");
		
		assertTrue(webtest.isTextPresent("������Ϣ"));
	}
	
	
	@Test(description="��ѯ��ȡ������")
	public void test3() throws Exception {
	
		//������ȡ������ҳ��
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[6]");
		webtest.type("xpath=//*[@id=\"userName\"]","111");
		webtest.type("xpath=//*[@id=\"orderNo\"]","100000143");
		webtest.click("class=wst-btn wst-btn-query");	
		webtest.click("class=orderDetail");
		
		assertTrue(webtest.isTextPresent("������Ϣ"));
	}
	
	
	@Test(description="�鿴������Ʒ����")
	public void test4() throws Exception {
		
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		Thread.sleep(3000);
		webtest.click("class=uc-order-icon5");
		Thread.sleep(3000);
		webtest.click("class=orderDetail");
		
		assertTrue(webtest.isTextPresent("������Ϣ"));
	}
	
	
	@Test(description="��ѯ-ָ��������Ʒ����")
	public void test5() throws Exception {
		
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		Thread.sleep(3000);
		webtest.click("class=uc-order-icon5");
		webtest.type("xpath=//*[@id=\"userName\"]","111");
		webtest.type("xpath=//*[@id=\"orderNo\"]","100000176");
		webtest.click("xpath=//*[@id=\"isRefund\"]");
		webtest.click("xpath=//*[@id=\"isRefund\"]/option[3]");
		webtest.click("class=wst-btn wst-btn-query");
		Thread.sleep(2000);	
		webtest.click("class=orderDetail");
		
		assertTrue(webtest.isTextPresent("������Ϣ"));
	}
	
	
	@Test(description="�����ջ�����Ʒȷ���ջ�")
	public void test6() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		Thread.sleep(3000);
		webtest.click("class=uc-order-icon3");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[1]/a");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("���ջ�����"));
		
	}
	
	
	@Test(description="ȡ��δ��������")
	public void test7() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		webtest.click("class=uc-order-icon2");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[2]/td/div[3]/a");
		webtest.click("xpath=//*[@id=\"reason\"]");
		webtest.click("xpath=//*[@id=\"reason\"]/option[2]");
    	webtest.click("xpath=//*[@id=\"layui-layer2\"]/div[3]/a[1]");
    	
    	assertFalse(webtest.isTextPresent("���Ⲥ����"));
	}
	
	
	@Test(description="�Դ��ջ���Ʒ�ܾ��ջ�")
	public void test8() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		webtest.click("class=uc-order-icon3");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[2]/a");
		webtest.click("xpath=//*[@id=\"reason\"]");
		webtest.click("xpath=//*[@id=\"reason\"]/option[2]");
		webtest.click("xpath=//*[@id=\"layui-layer2\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("���ջ�����"));
	}
	
	
	@Test(description="ͨ���û�����-�����򣬶���Ҫ�����ָ����Ʒ��������")
	public void test9() throws Exception {	
		
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[1]/li");
		webtest.type("xpath=//*[@id=\"search-ipt\"]","��ݮ");
		webtest.click("xpath=//*[@id=\"search-btn\"]");

		assertTrue(webtest.isTextPresent("�г���"));
	}
	
	
	@Test(description="�����������ת��ǰ����ҳҳ��")
	public void test10() throws Exception {
		
		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[1]/div[1]/a");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		
		assertTrue(webtest.isTextPresent("��ӭ��"));
	}
	
	
	@Test(description="�����������ת�����ﳵҳ��")
	public void test11() throws Exception {
		
		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[1]/div[1]/a");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[2]/a/p");
		
		assertTrue(webtest.isTextPresent("���ﳵ"));
	}
	
	@Test(description="����������-WSTMart���̻��̳�")
	public void test12() throws Exception {

		
		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[1]/div[1]/a");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[6]/div[1]/div/div[8]/div[2]/div[1]/a");
	}
}

