package com.webtest.wangliyu;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class HuiyuanguanliTest extends BaseTest {


	
	@Test(priority=1,description="07�޸��˺�success")
	public void test3() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=��Ա����");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		Thread.sleep(2000);
		webtest.type("id=userName","VIP");
		Thread.sleep(2000);
		webtest.type("id=userPhone","15232239098");
		webtest.type("id=userEmail","256@qq.com");
		webtest.type("id=userQQ","29105789");		
		webtest.click("xpath=/html/body/form/table/tbody/tr[9]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("VIP"));
	}
	
	@Test(priority=2,description="06ɾ���˺�")
	public void test1() throws Exception {
		Thread.sleep(3000);
		webtest.click("link=ɾ��");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
		Thread.sleep(2000);
	}
	
	@Test(priority=3,description="08�޸��˺ţ���д�û�����fail")
	public void test4() throws Exception{
		
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		Thread.sleep(2000);
		webtest.type("id=userPhone","13455676587");
		Thread.sleep(2000);
		webtest.type("id=userEmail","286609@qq.com");
		Thread.sleep(2000);
		webtest.type("id=userQQ","29197447");	
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[9]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("�Ա�"));
	}
	
	@Test(priority=4,description="09�޸��˺ţ��������ֻ����룩fail")
	public void test5() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userForm\"]/table/tbody/tr[9]/td/input[3]");
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("id=userName","VIPP");
		Thread.sleep(2000);
//		webtest.type("id=userPhone","12345678900");
		webtest.type("id=userEmail","27566@qq.com");
		Thread.sleep(2000);
		webtest.type("id=userQQ","2911765");	
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("VIPP"));
	}
	
	
	@Test(priority=5,description="10�޸��˺ţ����������䣩fail")
	public void test6() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userForm\"]/table/tbody/tr[9]/td/input[3]");
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		Thread.sleep(2000);
		webtest.type("id=userName","VIPPP");
		Thread.sleep(2000);
		webtest.type("id=userPhone","15231120909");
		Thread.sleep(2000);
//		webtest.type("id=userEmail","23@qq.com");
		webtest.type("id=userQQ","235610");
		Thread.sleep(2000);
		webtest.click("xpath=*[@id=\"userRankForm\"]/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("VIPPP"));
	}
	
	@Test(priority=6,description="11�޸��˺ţ��������Ա���֣�fail")
	public void test7() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userForm\"]/table/tbody/tr[9]/td/input[3]");
		Thread.sleep(3000);
		webtest.click("link=�޸�");
		Thread.sleep(2000);
		webtest.typeAndClear("id=userName","");
		webtest.typeAndClear("id=userPhone","");
		webtest.typeAndClear("id=userEmail","");
		webtest.typeAndClear("id=userQQ","");
		webtest.typeAndClear("id=userScore","");
		Thread.sleep(2000);
		webtest.type("id=userName","VIPPPP");
		Thread.sleep(2000);
		webtest.type("id=userPhone","15232435676");
		Thread.sleep(2000);
		webtest.type("id=userEmail","29097@qq.com");
		Thread.sleep(2000);
		webtest.type("id=userQQ","2894");	
		Thread.sleep(2000);
		webtest.click("xpath=*[@id=\"userRankForm\"]/table/tbody/tr[7]/td/input[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("VIPPPP"));
	}
	
	@Test(priority=7,description="41��ѯ-ֻ�����˺���success")
	public void test8() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"userForm\"]/table/tbody/tr[9]/td/input[3]");
		Thread.sleep(2000);
		webtest.type("id=loginName1", "maysh2009");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("maysh2009"));
	}
	
	@Test(priority=8,description="42��ѯ-ֻ����绰����success")
	public void test9() throws Exception{
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginName1", "");
		Thread.sleep(2000);
		webtest.type("id=loginPhone", "13172912018");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("13172912018"));
	}
	
	@Test(priority=9,description="43��ѯ-ֻ��������success")
	public void test10() throws Exception{
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginPhone", "");
		Thread.sleep(2000);
		webtest.type("id=loginEmail", "232@sd.com");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("232@sd.com"));
	}
	
	@Test(priority=10,description="44��ѯ-ֻ������������fail")
	public void test11() throws Exception{
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginEmail", "");
		Thread.sleep(2000);
		webtest.type("id=loginEmail", "232@sdcom");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertFalse(webtest.isTextPresent("232@sdcom"));
		
	}
	
	@Test(priority=11,description="45��ѯ-ֻ�����˺�����һ����success")
	public void test12() throws Exception{
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginEmail", "");
		Thread.sleep(2000);
		webtest.type("id=loginName1", "vvv");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("vvv"));
		
	}
	
	@Test(priority=12,description="46��ѯ-ֻ�����ֻ��ŵ�һ����success")
	public void test13() throws Exception{
		Thread.sleep(2000);
		webtest.typeAndClear("id=loginName1", "");
		Thread.sleep(2000);
		webtest.type("id=loginPhone", "138");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"query\"]/input[4]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("138"));
		
	}
	
	
	
	
	
}
