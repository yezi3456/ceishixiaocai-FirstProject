package com.webtest.renzixuan;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;
public class LoginHoutaiFail extends BaseTest1{
	String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(priority=1,description="27.��̨��¼ʧ�ܣ��������")
	public void login() throws Exception {
		webtest.open(url);
		webtest.type("id=loginPwd","5201314z");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		assertFalse(webtest.isTextPresent("�˳�ϵͳ"));
	}

	@Test(priority=2,description="28.��̨��¼ʧ�ܣ��û�������")
	public void login1() throws Exception {
		webtest.open(url);
		webtest.type("id=loginName","1");
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		assertFalse(webtest.isTextPresent("�˳�ϵͳ"));
	}
}
