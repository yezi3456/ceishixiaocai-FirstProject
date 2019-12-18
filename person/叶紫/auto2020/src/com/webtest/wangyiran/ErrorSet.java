package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.core.BaseTestFail;

@Listeners(com.webtest.core.WebTestListener.class)
public class ErrorSet extends BaseTestFail{
	
	
	@Test(description="27 ������Ʒҳ��༭��Ʒ����(ʧ������:��Ʒ����Ϊ�����ַ�)")
	//27 ������Ʒҳ��༭��Ʒ����(ʧ������:��Ʒ����Ϊ�����ַ�)
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsName\"]", "!");
		assertTrue(webtest.isTextPresent("��������ȷ��Ʒ����"));
		webtest.leaveFrame();
	}
	

	@Test(description="28 ������Ʒҳ��༭��Ʒ����(ʧ������:��Ʒ����̫��)")
	//28 ������Ʒҳ��༭��Ʒ����(ʧ������:��Ʒ����̫��)
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsName\"]", "��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ��Ʒ");
		assertTrue(webtest.isTextPresent("��Ʒ���ƹ���!"));
		webtest.leaveFrame();
	}
	

	@Test(description="30������Ʒҳ��༭��Ʒ���(ʧ������:��Ʒ���Ϊ�����ַ�)")
	// 30������Ʒҳ��༭��Ʒ���(ʧ������:��Ʒ���Ϊ�����ַ�)
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "!");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��������ȷ����Ʒ���"));
		webtest.leaveFrame();
	}


	@Test(description="31������Ʒҳ��༭��Ʒ���(ʧ������:��Ʒ��Ź���)")
	// 31������Ʒҳ��༭��Ʒ���(ʧ������:��Ʒ��Ź���)
	public void test4() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "0000001000000100000010000001000000100000010000001000000100000010000001");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��������ȷ����Ʒ���"));
		webtest.leaveFrame();
	}

	
	@Test(description="32������Ʒҳ��༭��Ʒ���(ʧ������:��Ʒ��Ź���)")
	// 32������Ʒҳ��༭��Ʒ���(ʧ������:��Ʒ��Ź���)
	public void test5() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "1");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��������ȷ����Ʒ���"));
		webtest.leaveFrame();
	}


	@Test(description="47������Ʒҳ��༭��Ʒ��λ(ʧ������:��Ʒ��λΪ�����ַ�)")
	// 47������Ʒҳ��༭��Ʒ��λ(ʧ������:��Ʒ��λΪ�����ַ�)
	public void test6() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsUnit\"]", "!!");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��������ȷ��Ʒ��λ"));
		webtest.leaveFrame();
	}
	

	@Test(description="48������Ʒҳ��༭��Ʒ��λ(ʧ������:��Ʒ��λΪ����)")
	// 48������Ʒҳ��༭��Ʒ��λ(ʧ������:��Ʒ��λΪ����)
	public void test7() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsUnit\"]", "123");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��������ȷ��Ʒ��λ"));
		webtest.leaveFrame();
	}
	

	@Test(description="59��ѯ��Ʒ����(ʧ������:���������ַ�)")
	//59��ѯ��Ʒ����(ʧ������:���������ַ�)
	public void test8() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[7]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"keyName\"]", "!!!!!");
		webtest.click("xpath=/html/body/div[1]/div[1]/button");
		assertTrue(webtest.isTextPresent("��������ȷ����Ʒ��������"));
	}
	

	@Test(description="58��ѯ��Ʒ����(�ɹ�����)")
	//58��ѯ��Ʒ����(�ɹ�����)
	public void test9() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[7]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"keyName\"]", "�ߴ�");
		webtest.click("xpath=/html/body/div[1]/div[1]/button");
		assertTrue(webtest.isTextPresent("������"));
		webtest.leaveFrame();
	}
	

	@Test(description="66��ѯƷ������(ʧ������:���������ַ�)")
	//66��ѯƷ������(ʧ������:���������ַ�)
	public void test10() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1007|c105\"]/div/a[1]");
		webtest.type("xpath=//*[@id=\"brandName\"]", "test01");
		webtest.click("xpath=//*[@id=\"brandForm\"]/table/tbody/tr[6]/td/button[1]");
		assertTrue(webtest.isTextPresent("Ʒ�����Ʋ���Ϊ�����ַ�"));
		webtest.leaveFrame();
	}
	

	@Test(description="62ʧ�ܲ�ѯƷ������,���������ַ�")
	//62��ѯƷ������(ʧ������:���������ַ�)
	public void test11() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"key\"]", "!");
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("��������ȷ��Ʒ������"));
		webtest.leaveFrame();
	}
	

	@Test(description="63ʧ�ܲ�ѯƷ������,����հ�")
	//63��ѯƷ������(ʧ������:����հ�)
	public void test12() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"key\"]", "      ");
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("Ʒ�����Ʋ���Ϊ��"));
		webtest.leaveFrame();
	}
	

	

	
}
