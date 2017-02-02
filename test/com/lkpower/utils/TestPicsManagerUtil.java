package com.lkpower.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPicsManagerUtil {

	WebDriver driver=DriverManagerUtil.getWebdriver("firefox");
	@Test
	public void testPics(){
		
		driver.get("http://www.baidu.com");
		PicsManagerUtil.getScreenshot(driver, "百度首页图片");
	}
	
			
}
