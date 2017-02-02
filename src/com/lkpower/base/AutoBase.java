package com.lkpower.base;

import org.openqa.selenium.WebElement;

public class AutoBase {

	/**
	 * 
	 * @Function 针对selenium API进行二次封装
	 * @author xuran
	 * @Date 2017年1月9日 下午5:16:50
	 * @param element 页面元素
	 */
	public void click(WebElement element){
		element.click();
	}
	
	public void sendKeys(WebElement element,String content){
		element.clear();
		element.sendKeys(content);
	}
	
	public void submit(WebElement element){
		element.submit();
	}
}
