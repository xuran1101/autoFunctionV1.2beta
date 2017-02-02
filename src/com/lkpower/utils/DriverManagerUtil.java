package com.lkpower.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManagerUtil {
	
	
	/**
	 * 
	 * @Function 浏览器初始化
	 * @author xuran
	 * @Date 2017年1月11日 下午5:12:38
	 * @param browserName 接收浏览器名称
	 * @return driver
	 */
	public static WebDriver getWebdriver(String browserName){
		WebDriver driver;
		
		if(browserName.equals("firefox")){
			driver=new FirefoxDriver();
			
		}else if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver","tools\\drivers\\chrome\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browserName.equals("ie32")){
			
			System.setProperty("webdriver.ie.driver","tools\\drivers\\ie\\IEDriverServer_win32.exe");
			driver=new InternetExplorerDriver();
				
		}else{
			System.setProperty("webdriver.ie.driver","tools\\drivers\\ie\\IEDriverServer_win64.exe");
			driver=new InternetExplorerDriver();
		}
		
		return driver;
		
	}

}
