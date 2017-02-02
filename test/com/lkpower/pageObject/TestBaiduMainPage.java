package com.lkpower.pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lkpower.utils.DriverManagerUtil;

public class TestBaiduMainPage {
	
	private WebDriver driver;
	BaiduMainPage baiduMainPage;
	
	@BeforeMethod
	public void beforeMethod(){
		
		driver=DriverManagerUtil.getWebdriver("chrome");
		baiduMainPage=new BaiduMainPage(driver);
	}
	
	@Test
	public void testSendKeys() throws InterruptedException{
		baiduMainPage.sendKeys("Hello 2017");
		Thread.sleep(3000);
	}
	
	@Test
	public void testClick(){
		baiduMainPage.click();
	}
	
	@Test
	public void testClickNewsLink(){
		baiduMainPage.clickNewsLink();
	}
	
	@Test
	public void testClickLoginLink() throws InterruptedException{
		baiduMainPage.clickLoginLink();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void afterMethod(){
		driver.quit();
	}
	
	
}
