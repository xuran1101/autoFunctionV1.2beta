package com.lkpower.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lkpower.base.BaseTest;
import com.lkpower.pageObject.BaiduMainPage;

/**
 * 
 * @Function 封装百度首页的测试用例
 * @author xr
 * @Date 2017年1月16日 上午11:33:54
 */
public class BaiduMainPageCase extends BaseTest{
	
	BaiduMainPage baiduMainPage; 

	@BeforeMethod(groups={"P0","P1"})
	public void beforeMethod2() throws InterruptedException{
		
		baiduMainPage = new BaiduMainPage(driver);//每条用例执行前，先初始化对象，执行完父类中的beforeMethod(),执行本类的beforeMethod2()
	}
	
	/**
	 * 
	 * @Function case1-输入正确的关键字进行测试 
	 * @author xr
	 * @throws InterruptedException 
	 * @Date 2017年1月16日 下午1:38:57
	 */
	
	@Test(description="case1-输入正确的关键字进行测试 ",groups={"P0"})
	public void testcase001() throws InterruptedException{
		
		baiduMainPage.sendKeys("Hello 2017");
		baiduMainPage.click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().contains("Hello 2017"));
		
	}
	
	/**
	 * 
	 * @Function case2-不输入关键字进行测试 
	 * @author xr
	 * @throws InterruptedException 
	 * @Date 2017年1月16日 下午1:47:10
	 */
	@Test(description="case2-不输入关键字进行测试 ",groups={"P0"})
	public void testcase002() throws InterruptedException{
		
		baiduMainPage.click();
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.baidu.com/"));
	}
	
	
}
