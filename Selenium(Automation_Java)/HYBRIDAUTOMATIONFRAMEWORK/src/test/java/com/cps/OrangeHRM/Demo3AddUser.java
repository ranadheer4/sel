package com.cps.OrangeHRM;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.prakash.genericUtility.IConstants;

public class Demo3AddUser {
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

    @Test(priority=-1)
    public void addUser() {
    	Reporter.log("Successfully added  User----priority=-1",true);   	
    }
    @Test
    public void editUser()
    {
    	Reporter.log("Successfully edited  User----priority=non",true);
    }
    @Test(priority=0,dependsOnMethods="editUser")
    public void deletUser1()
    {
    	Reporter.log("Successfully deleted  User----priority=0",true);
    }
    @Test(priority=1,invocationCount=3)
    public void saveUser1()
    {
    	Reporter.log("Successfully save  User----priority=1",true);
    }
    @Test(priority=1)
    public void checkUser1()
    {
    	Reporter.log("Successfully check  User----priority=1",true);
    }
}
