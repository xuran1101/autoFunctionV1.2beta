package com.lkpower.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.lkpower.utils.DriverManagerUtil;

public class TestAutoBase {
	
	AutoBase autoBase=new AutoBase();
	private WebDriver driver=DriverManagerUtil.getWebdriver("chrome");

	@Test
	public void testClick(){
		driver.get("http://www.baidu.com");
		autoBase.click(driver.findElement(By.id("kw")));
		
	}
}
