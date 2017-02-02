package com.lkpower.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.lkpower.base.AutoBase;
import com.lkpower.path.Xpath;
import com.lkpower.utils.XpathManagerUtil;

/**
 * 
 * @Function 封装百度登录页面的操作事件
 * @author xr
 * @Date 2017年1月16日 上午11:27:29
 */
public class BaiduLoginPage extends AutoBase{

	private WebDriver driver;
	BaiduMainPage baiduMainPage;
	
	public BaiduLoginPage(WebDriver driver){
		
		this.driver=driver;
		baiduMainPage=new BaiduMainPage(driver);
		baiduMainPage.clickLoginLink();//打开登录页面
	}
	
	/**
	 * 
	 * @Function 向登录页面输入用户名
	 * @author xr
	 * @Date 2017年1月16日 上午11:01:04
	 * @param username 用户名
	 */
	public void sendUserName(String username){
		
		sendKeys(driver.findElement(By.xpath(XpathManagerUtil.getXpathValue(Xpath.config_xpath_baiduLoginPage, "userName"))), username);
	}
	
	/**
	 * 
	 * @Function 向登录页面输入密码
	 * @author xr
	 * @Date 2017年1月16日 上午11:03:56
	 * @param password 密码
	 */
	public void sendPassword(String password){
		
		sendKeys(driver.findElement(By.xpath(XpathManagerUtil.getXpathValue(Xpath.config_xpath_baiduLoginPage, "password"))),password);
	}
	
	/**
	 * 
	 * @Function 点击登录页面的登录按钮
	 * @author xr
	 * @Date 2017年1月16日 上午11:05:52
	 */
	public void clickLoginBtn(){
		
		click(driver.findElement(By.xpath(XpathManagerUtil.getXpathValue(Xpath.config_xpath_baiduLoginPage, "lgClickBtn"))));
	}
	
	/**
	 * 
	 * @Function 得到ErrorMesage的提示内容
	 * @author xr
	 * @Date 2017年1月16日 下午2:50:27
	 */
	public String getErrorMessage(){
		
		return driver.findElement(By.xpath(XpathManagerUtil.getXpathValue(Xpath.config_xpath_baiduLoginPage, "errorMs"))).getText();
	}
	
}
