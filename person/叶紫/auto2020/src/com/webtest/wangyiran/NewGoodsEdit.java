package com.webtest.wangyiran;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

@Listeners(com.webtest.core.WebTestListener.class)
public class NewGoodsEdit extends BaseTest{
		
	@Test(description="25 ������Ʒҳ��༭��Ʒ����(�ɹ�����)")
	//25 ������Ʒҳ��༭��Ʒ����(�ɹ�����)
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsName\"]", "test001");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("test001"));
		webtest.leaveFrame();
	}
	
	@Test(description="26 ������Ʒҳ��༭��Ʒ����(ʧ������:��Ʒ����Ϊ�ո�)")
	//26 ������Ʒҳ��༭��Ʒ����(ʧ������:��Ʒ����Ϊ�ո�)
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsName\"]", "   ");
		assertTrue(webtest.isTextPresent("��Ʒ���Ʋ���Ϊ��"));
		webtest.leaveFrame();
	}
	
	
	
	
	
	@Test(description=" 29������Ʒҳ��༭��Ʒ���(�ɹ�����)")
	// 29������Ʒҳ��༭��Ʒ���(�ɹ�����)
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "00000012");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("00000012"));
		webtest.leaveFrame();
	}

	
	
	@Test(description="33������Ʒҳ��༭��Ʒ���(ʧ������:��Ʒ���Ϊ��)")
	// 33������Ʒҳ��༭��Ʒ���(ʧ������:��Ʒ���Ϊ��)
	public void test4() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "     ");
		assertTrue(webtest.isTextPresent("��Ʒ��Ų���Ϊ��"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="34������Ʒҳ��༭��Ʒ����(�ɹ�����)")
	// 34������Ʒҳ��༭��Ʒ����(�ɹ�����)
	public void test5() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"productNo\"]", "123456789101"
				+ "");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		assertTrue(webtest.isTextPresent("00000012"));
		webtest.leaveFrame();
	}
	
	
	
	@Test(description="35������Ʒҳ��༭�г��۸�(�ɹ�����)")
	//35������Ʒҳ��༭�г��۸�(�ɹ�����)
	public void test6() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "888.88");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		assertTrue(webtest.isTextPresent("888.88"));
		webtest.leaveFrame();
	}
	
	@Test(description="36������Ʒҳ��༭�г��۸�(ʧ������: �۸�Ϊ0)")
	//36������Ʒҳ��༭�г��۸�(ʧ������: �۸�Ϊ0)
	public void test7() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "0");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("�۸�������0"));
		webtest.leaveFrame();
	}
	
	@Test(description="37������Ʒҳ��༭�г��۸�(ʧ������:���������ַ�)")
	//37������Ʒҳ��༭�г��۸�(ʧ������:���������ַ�)
	public void test8() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "!");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("�۸�������0"));
		webtest.leaveFrame();
	}
	
	@Test(description="38������Ʒҳ��༭�г��۸�(ʧ������:���븺��)")
	//38������Ʒҳ��༭�г��۸�(ʧ������:���븺��)
	public void test9() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "-2");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("�۸�������0"));
		webtest.leaveFrame();
	}
	
	@Test(description="39������Ʒҳ��༭�г��۸�(ʧ������:����հ�)")
	//39������Ʒҳ��༭�г��۸�(ʧ������:����հ�)
	public void test10() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "    ");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("�г��۸���Ϊ��"));
		webtest.leaveFrame();
	}
	
		
	
	@Test(description="40������Ʒҳ��༭��Ʒ���(�ɹ�����)")
	// 40������Ʒҳ��༭��Ʒ���(�ɹ�����)
	public void test11() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsStock\"]", "777");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("777"));
		webtest.leaveFrame();
	}

	
	@Test(description="41������Ʒҳ��༭��Ʒ���(ʧ������:���븺��)")
	// 41������Ʒҳ��༭��Ʒ���(ʧ������:���븺��)
	public void test12() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsStock\"]", "-2");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"shopPrice\"]");
		assertTrue(webtest.isTextPresent("����д������"));
		webtest.leaveFrame();
	}

	
	@Test(description="42������Ʒҳ��༭��Ʒ���(ʧ������:�����ַ�)")
	// 42������Ʒҳ��༭��Ʒ���(ʧ������:�����ַ�)
	public void test13() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsStock\"]", "!");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"shopPrice\"]");
		assertTrue(webtest.isTextPresent("����д������"));
		webtest.leaveFrame();
	}
	
	@Test(description="43������Ʒҳ��༭��Ʒ���(ʧ������:����Ϊ��)")
	// 43������Ʒҳ��༭��Ʒ���(ʧ������:����Ϊ��)
	public void test14() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsStock\"]", "     ");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��Ʒ��治��Ϊ��"));
		webtest.leaveFrame();
	}
	
	@Test(description="44������Ʒҳ��༭Ԥ�����(�ɹ�����)")
	// 44������Ʒҳ��༭Ԥ�����(�ɹ�����)
	public void test15() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"warnStock\"]", "10");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("10"));
		webtest.leaveFrame();
	}
	
	
	
	@Test(description="45������Ʒҳ��༭��Ʒ��λ(�ɹ�����)")
	// 45������Ʒҳ��༭��Ʒ��λ(�ɹ�����)
	public void test16() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsUnit\"]", "��");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		assertTrue(webtest.isTextPresent("��"));
		webtest.leaveFrame();
	}
	
	@Test(description="46������Ʒҳ��༭��Ʒ��λ(ʧ������:��Ʒ��λΪ��)")
	// 46������Ʒҳ��༭��Ʒ��λ(ʧ������:��Ʒ��λΪ��)
	public void test17() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsUnit\"]", "     ");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��Ʒ��λ����Ϊ��"));
		webtest.leaveFrame();
	}
	
	

	@Test(description="49�޸���Ʒ״̬")
	// 49�޸���Ʒ״̬
	public void test18() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.click("xpath=//*[@id=\"isSale-0\"]");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("�¼�"));
		webtest.leaveFrame();
	}
	
	@Test(description="50�޸���Ʒ����")
	// 50�޸���Ʒ����
	public void test19() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.click("xpath=//*[@id=\"isRecom\"]");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("�Ƽ�"));
		webtest.leaveFrame();
	}
	

	@Test(description="51�޸ı������(�ɹ�����)")
	// 51�޸ı������(�ɹ�����)
	public void test20() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.selectByValue("id=cat_0", "50");
		Thread.sleep(2000);
		webtest.selectByValue("id=cat_0_50", "219");
		Thread.sleep(2000);
		webtest.selectByValue("id=cat_0_50_219", "225");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("�Ƽ�"));
		webtest.leaveFrame();
	}


}
