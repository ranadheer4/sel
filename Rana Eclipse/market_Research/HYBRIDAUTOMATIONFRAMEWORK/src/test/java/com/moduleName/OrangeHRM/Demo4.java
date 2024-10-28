package com.moduleName.OrangeHRM;
import org.testng.annotations.Test;

import com.projectName.genericUtility.BaseClass;
import com.projectName.genericUtility.IConstants;

public class Demo4 extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void m1() {
		
	}
	
}
