package com.lkpower.testcase;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lkpower.base.BaseTest;
import com.lkpower.listener.ReTry;

public class XrTestCase extends BaseTest{
	
	@Test
	public void test(){
		Assert.assertEquals(1, 1,"not same,error");
		System.out.println("已执行");
	}
}
