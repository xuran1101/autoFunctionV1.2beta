package com.lkpower.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDriverManagerUtil {
	
	
	@BeforeMethod
	public void beforeMethod(){
		
	}

	@Test
	public void testOpenChrome(){
		
		DriverManagerUtil.getWebdriver("chrome");
	}

	@Test
	public void testOpenFf(){
		DriverManagerUtil.getWebdriver("firefox");
	}
	
	@Test
	public void testOpenIE32(){
		DriverManagerUtil.getWebdriver("ie32");
	}
	
	@AfterMethod
	public void afterMethod(){
		
	}
}
