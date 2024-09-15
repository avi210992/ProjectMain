package Package2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	public void m1()
	{
		System.out.println("in  Package2 Test2 class and Testmethod m1");
	}
	
	@Test (groups ="sanity")
	public void m2()
	{
		System.out.println("in  Package2  Test2 class and Testmethod m2");
	}
	
	@Test
	public void m3()
	{
		System.out.println("in Package2 Test2 class and Testmethod m3");
	}
	
	@BeforeMethod
	public void BefTest1()
	{
		System.out.println("in Package2 Test2 class - Before Method");
	}
	
	@AfterMethod
	public void AftTest1()
	{
		System.out.println("in Package2  Test2 class - After Method");
	}
	
	@BeforeGroups (groups ="sanity")
	void befgrp()
	{
		System.out.println("%%%%%%%%%%%%%%%%%%%% Before any group %%%%%%%%%%%%%%");
	}
	
	@BeforeTest(groups ="sanity")
	void beftest()
	{
		System.out.println("%%%%%%%%%%%%%%%%%%%% Before any Test %%%%%%%%%%%%%%");
	}
	
}
