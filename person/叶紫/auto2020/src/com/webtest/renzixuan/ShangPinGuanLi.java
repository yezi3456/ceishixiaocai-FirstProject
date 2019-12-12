package com.webtest.renzixuan;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;

public class ShangPinGuanLi extends BaseTest1{
	String url="http://localhost/wstshop/admin/index/login.html";	
	
	@Test(priority=2,description="37.商品管理的仓库商品根据订单号查询(不选择商品分类)")
	public void b() throws Exception {
		//登录后台
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		//点击商品管理	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]");
		//点击仓库商品
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");	
		//输入订单编号148280306147836
		webtest.enterFrame("wst-lframe-22");
		webtest.type("id=goodsName","148280306147836");
		//点击查询
		webtest.click("xpath=/html/body/div[1]/button");	
		assertTrue(webtest.isTextPresent("查询"));
	}
	
	
		@Test(priority=3,description="38.商品管理的仓库商品点击第一个商品的编辑并保存")
		public void a() throws Exception {
			webtest.leaveFrame();
			//点击仓库商品
			webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");	
			webtest.enterFrame("wst-lframe-22");
			//点击编辑
			webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");	
			//点击保存
			webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");	
			assertTrue(webtest.isTextPresent("查询"));
		}
	
	
		@Test(priority=4,description="39.商品管理的仓库商品点击第一个商品的删除并点击取消")
		public void C() throws Exception {
			webtest.leaveFrame();
			//点击仓库商品
			webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");
			webtest.enterFrame("wst-lframe-22");
			//点击删除
			webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[3]");	
			//点击取消
			webtest.click("xpath=//*[@id=\"layui-layer2\"]/div[3]/a[2]");	
			assertTrue(webtest.isTextPresent("查询"));
		}
	
	
	    @Test(priority=5,description="40.商品管理的仓库商品设置第一个商品为推荐")
		public void d() throws Exception {
			webtest.leaveFrame();
			//点击仓库商品
			webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");
			webtest.enterFrame("wst-lframe-22");
			//点击第一个商品前面的勾选框
			webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");	
			//点击推荐
			webtest.click("xpath=/html/body/div[2]/button[2]");	
			assertTrue(webtest.isTextPresent("查询"));
		}
	 
	
	    @Test(priority=6,description="41.商品管理的仓库商品根据所属分类查询（时蔬水果-进口水果-橙柚）")
		public void n() throws Exception {
	    	webtest.leaveFrame();
			//点击仓库商品
			webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[4]");	
			//时蔬水果-进口水果-橙柚
			webtest.enterFrame("wst-lframe-22");
			webtest.click("xpath=//*[@id=\"cat_0\"]/option[2]");
			webtest.click("xpath=//*[@id=\"cat_0_47\"]/option[2]");
			webtest.click("xpath=//*[@id=\"cat_0_47_61\"]/option[2]");
			//点击查询
			webtest.click("xpath=/html/body/div[1]/button");	
			assertTrue(webtest.isTextPresent("查询"));
		}
}
