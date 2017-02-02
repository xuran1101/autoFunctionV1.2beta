package com.lkpower.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.lkpower.utils.DriverManagerUtil;

/**
 * 
 * @Function 被case类继承，封装了beforeMehtod(初始化浏览器)和afterMethod(关闭浏览器窗口)方法
 * @author xr
 * @Date 2017年1月16日 下午3:10:48
 */
public class BaseTest {

	protected WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	@BeforeMethod(groups={"P0","P1"})
	public void beforeMethod(){
		driver=DriverManagerUtil.getWebdriver("chrome");//浏览器初始化
	}
	
	@AfterMethod(groups={"P0","P1"})
	public void afterMethod() throws InterruptedException{
		
		Thread.sleep(2000);//每次关闭之前停2秒，可以看出操作效果
		driver.quit();//每次执行完用例都要关闭当前driver
	}
}
