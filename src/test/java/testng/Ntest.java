package testng;

import org.testng.annotations.Test;

public class Ntest {
	
		@Test
	    public void tn() {
	        System.out.println("In tn");
	    }
	    @Test
	    public void sum() {
	        System.out.println("In sum");
	    }
	    @org.testng.annotations.BeforeMethod
	    public void BeforeMethod() {
	        System.out.println("BeforeMethod");
	    }
	    @org.testng.annotations.AfterMethod
	    public void AfterMethod() {
	        System.out.println("AfterMethod");
	    }
	    @org.testng.annotations.BeforeClass
	    public void BeforeClass() {
	        System.out.println("BeforeClass");
	    }
	    @org.testng.annotations.AfterClass
	    public void AfterClass() {
	        System.out.println("AfterClass");
	    }
	    @org.testng.annotations.BeforeGroups
	    public void BeforeGroups() {
	        System.out.println("BeforeGroups");
	    }
	    @org.testng.annotations.AfterGroups
	    public void AfterGroups() {
	        System.out.println("AfterGroups");
	    }
	    @org.testng.annotations.BeforeTest
	    public void BeforeTest() {
	        System.out.println("BeforeTest");
	    }
	    @org.testng.annotations.AfterTest
	    public void AfterTest() {
	        System.out.println("AfterTest");
	    }
	    @org.testng.annotations.BeforeSuite
	    public void BeforeSuite() {
	        System.out.println("BeforeSuite");
	    }
	    @org.testng.annotations.AfterSuite
	    public void AfterSuite() {
	        System.out.println("AfterSuite");
	    }
	    	}
