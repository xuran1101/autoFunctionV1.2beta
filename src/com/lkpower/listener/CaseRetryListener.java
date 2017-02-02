package com.lkpower.listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class CaseRetryListener implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		
		IRetryAnalyzer iRetryAnalyzer=annotation.getRetryAnalyzer();
		System.out.println("iRetryAnalyzer="+iRetryAnalyzer);
		if(iRetryAnalyzer==null){//如果注释中没有retryAnalyzer=ReTry.class,就加上，可避免在每个Test注解后分别写上
			annotation.setRetryAnalyzer(ReTry.class);//为每个test标签添加重试机制
		}
		
	}

}
