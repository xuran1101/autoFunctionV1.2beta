package com.lkpower.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class XpathManagerUtil {

	public static String getXpathValue(String filepath,String key){
		
		File file=new File(filepath);//根据文件路径创建file文件
		FileInputStream i = null;
		try {
			i = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}//将file文件的内容读入到流中
		Properties p=new Properties();
		try {
			p.load(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p.getProperty(key);
	}
}
