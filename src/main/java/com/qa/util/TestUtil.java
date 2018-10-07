package com.qa.util;

import java.io.IOException;

import com.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public TestUtil() throws IOException {
		initialization();
	}
	public static int pageloadtimeout = Integer.parseInt(prop.getProperty("pageloadtimeout"));
	public static int implicitwait = Integer.parseInt(prop.getProperty("implicitwait"));

}
