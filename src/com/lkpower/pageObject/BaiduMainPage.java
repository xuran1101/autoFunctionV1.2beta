package com.lkpower.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.lkpower.base.AutoBase;
import com.lkpower.path.Xpath;
import com.lkpower.utils.DriverManagerUtil;
import com.lkpower.utils.XpathManagerUtil;

/**
 * 
 * @Function 封装百度首页的操作事件
 * @author xr
 * @Date 2017年1月16日 上午9:59:19
 */
public class BaiduMainPage extends AutoBase {
	
	private WebDriver driver;//浏览器对象
	
	
	public BaiduMainPage(WebDriver driver){
		this.driver=driver;
		driver.get(XpathManagerUtil.getXpathValue(Xpath.config_xpath_baiduMainPage, "url"));
	}

	/**
	 * 
	 * @Function 接收百度首页关键字输入
	 * @author xr
	 * @Date 2017年1月16日 上午10:10:22
	 * @param baiduContent
	 */
	public void sendKeys(String content){
		
		sendKeys(driver.findElement(By.xpath(XpathManagerUtil.getXpathValue(Xpath.config_xpath_baiduMainPage, "baiduContent"))),content);
	}
	
	/**
	 * 
	 * @Function 点击“百度一下”
	 * @author xr
	 * @Date 2017年1月16日 上午10:11:09
	 */
	public void click(){
		
		click(driver.findElement(By.xpath(XpathManagerUtil.getXpathValue(Xpath.config_xpath_baiduMainPage, "bdClickBtn"))));
		
	}
	
	/**
	 * 
	 * @Function 点击“新闻”链接
	 * @author xr
	 * @Date 2017年1月16日 上午10:13:36
	 */
	public void clickNewsLink(){
		
		click(driver.findElement(By.xpath(XpathManagerUtil.getXpathValue(Xpath.config_xpath_baiduMainPage, "newsLinkBtn"))));
	}
	
	/**
	 * 
	 * @Function 点击百度首页上的“登录”链接
	 * @author xr
	 * @Date 2017年1月16日 上午10:18:44
	 */
	public void clickLoginLink(){
		
		click(driver.findElement(By.xpath(XpathManagerUtil.getXpathValue(Xpath.config_xpath_baiduMainPage, "loginLinkBtn"))));
	}
}
