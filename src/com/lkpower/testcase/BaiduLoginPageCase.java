package com.lkpower.testcase;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lkpower.base.BaseTest;
import com.lkpower.pageObject.BaiduLoginPage;

/**
 * 
 * @Function 用于封装百度登录页面的测试用例
 * @author xr
 * @Date 2017年1月16日 下午2:11:07
 */
public class BaiduLoginPageCase extends BaseTest{
	
	
	BaiduLoginPage baiduLoginPage;
	
	@BeforeMethod(groups={"P0","P1"})
	public void beforeMethod2() throws InterruptedException{
		
		baiduLoginPage=new BaiduLoginPage(driver);
		Thread.sleep(2000);
	}
		
	@Test(description="case1-输入错误的用户名和密码登录",groups = {"P1"})
	public void testUsernamePasswdError(){
		
		baiduLoginPage.sendUserName("123");
		baiduLoginPage.sendPassword("456");
		baiduLoginPage.clickLoginBtn();
		
		Assert.assertTrue(baiduLoginPage.getErrorMessage().contains("请输入验证码"));
	}
	
	@Test(description="case2-仅输入用户名，不输入密码登录",groups={"P0"})
	public void testOnlyUsername(){
		
		baiduLoginPage.sendUserName("123");
		baiduLoginPage.clickLoginBtn();
		
		Assert.assertTrue(baiduLoginPage.getErrorMessage().contains("请您填写密码"));
	}
	
	@Test(description="case3-仅输入密码，不输入用户名登录",groups={"P0"})
	public void testOnlyPassword(){
		
		baiduLoginPage.sendPassword("456");
		baiduLoginPage.clickLoginBtn();
		
		Assert.assertTrue(baiduLoginPage.getErrorMessage().contains("请您填写手机/邮箱/用户名"));
	}
	
	@Test(description="case4-用户名密码都不输入点击登录")
	public void testWithoutUserNameAndPwd(){
		
		baiduLoginPage.clickLoginBtn();
		Assert.assertTrue(baiduLoginPage.getErrorMessage().contains("请您填写手机/邮箱/用户名"));
	}
}
