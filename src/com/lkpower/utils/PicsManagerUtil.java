package com.lkpower.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class PicsManagerUtil {
	
	/**
	 * 
	 * @Function 实现web页面截图
	 * @author 徐然
	 * @date 2017年2月1日
	 * @param webDriver
	 * @param fileName 接收图片名称
	 * @return 图片路径
	 */
	public static String getScreenshot(WebDriver webDriver, String fileName) {
        String currentPath = System.getProperty("user.dir");//获取工程所在路径
        System.out.println("工程所在路径为："+currentPath);
        //selenium自动截图功能
        File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        //图片路径
        String filePath = currentPath+File.separator+"result"+File.separator+"pics"+File.separator+fileName+".png";
        try {
        	//拷贝图片到对应目录下
            FileUtils.copyFile(scrFile, new File(filePath));
        } catch (IOException e) {
            System.out.println("Can't save screenshot");
            e.printStackTrace();
        }
        return filePath;
    }
}
