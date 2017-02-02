package com.lkpower.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTry implements IRetryAnalyzer{
	
	private int retryCount=0;
	private int retryMaxCount=2;

	@Override
	public boolean retry(ITestResult iTestResult) {//返回false是不重试，返回true是重试

		if(iTestResult.getStatus()==2){//fail的状态是2
			if(retryCount<retryMaxCount){
				retryCount++;
				return true;
			}else{
				return false;
			}
			
		}else{
			return false;
		}
	}

}
