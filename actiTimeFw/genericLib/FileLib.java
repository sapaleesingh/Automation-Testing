package com.actitime.genericLib;

import java.io.FileInputStream;
import java.util.Properties;


public class FileLib {
	public String getPropertyKeyValue(String Key) throws Throwable
	{
		String dpxpath="./Data/commonData.properties";
		FileInputStream fl=new FileInputStream(dpxpath);
		Properties dpObj=new Properties();
		dpObj.load(fl);
		String value=dpObj.getProperty(Key);
		return value;
	}

}
