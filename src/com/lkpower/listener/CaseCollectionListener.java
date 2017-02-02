package com.lkpower.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.lkpower.base.BaseTest;
import com.lkpower.utils.PicsManagerUtil;

/**
 * 
 * @Function 监听Case执行结果，收集信息
 * @author 徐然
 * @date 2017年2月1日
 */
public class CaseCollectionListener extends TestListenerAdapter{
	
	//打印哪个类的日志，参数就是哪个类
	private static final Logger logger=LoggerFactory.getLogger(CaseCollectionListener.class);
	
	@Override
	public void onTestFailure(ITestResult iTestResult){//失败时打Log，截图
		
		logger.error("case执行失败={}",iTestResult.getTestClass()+"."+iTestResult.getMethod().getMethodName());
		BaseTest baseTest=(BaseTest)iTestResult.getInstance();
		PicsManagerUtil.getScreenshot(baseTest.getDriver(), iTestResult.getTestClass()+"."+iTestResult.getMethod().getMethodName());		
	};
	
	
	@Override
	public void onTestSuccess(ITestResult iTestResult){
		//成功时打印log
		logger.info("case执行成功={}",iTestResult.getTestClass()+"."+iTestResult.getMethod().getMethodName());
	
	};

}
