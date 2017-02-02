package com.lkpower.pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lkpower.utils.DriverManagerUtil;

public class TestBaiduLoginPage {
	
	BaiduLoginPage baiduLoginPage;//声明登录页面的对象，但是还未创建
	private WebDriver driver;//声明浏览器
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException{
		
		driver=DriverManagerUtil.getWebdriver("chrome");//初始化浏览器
		baiduLoginPage =new BaiduLoginPage(driver);	
		Thread.sleep(3000);//打开登录页面后先等待3秒钟
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException{
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void testSendUserName(){
		baiduLoginPage.sendUserName("user1");
	}
	
	@Test
	public void testSendPassword(){
		
		baiduLoginPage.sendPassword("123");
	}
	
	@Test
	public void testClickLoginBtn(){
		
		baiduLoginPage.clickLoginBtn();
	}
	
	
	
	
}
