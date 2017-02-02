package com.lkpower.testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lkpower.base.AutoBase;
import com.lkpower.utils.DriverManagerUtil;

public class TestOrder extends AutoBase{

	@BeforeMethod
	public void beforeMethod2(){
		System.out.println("beforemethod01");
	}
	
	@BeforeMethod
	public void beforeMethod1(){
		System.out.println("beforemethod02");
	}
	
	@BeforeMethod
	public void beforeMethod3(){
		System.out.println("beforemethod03");
	}
	
	@Test
	public void testcase001(){
		WebDriver driver=DriverManagerUtil.getWebdriver("chrome");
		driver.get("http://www.baidu.com");
	}
	
	@AfterMethod
	public void afterMethod1(){
		System.out.println("AfterMethod01");
	}
	
	@AfterMethod
	public void afterMethod2(){
		System.out.println("AfterMethod02");
	}
	
}
