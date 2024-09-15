package Package3;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 extends Test1 {

	
	@Test
	public void m1()
	{
		System.out.println("in Package3 Test2 class and Testmethod m1" + " and the Thread executing this method is " + Thread.currentThread().getName());

	}
	
	@Test (groups = "sanity")
	public void m2()
	{
		super.m2("sent from child class", 1);
		System.out.println("in  Package3 Test2 class and Testmethod m2" + " and the Thread executing this method is " + Thread.currentThread().getName());
	}
	
	@Test
	public void m3()
	{
		System.out.println("in Package3 Test2 class and Testmethod m3" + " and the Thread executing this method is " + Thread.currentThread().getName());
	}
	
	@BeforeMethod(groups = {"sanity"})
	public void Befmeth()
	{
	
		System.out.println("in  Package3 Test2 class - Before Method");
		Assert.fail();
	}
	@AfterMethod(groups = "sanity")
	public void Aftmeth()
	{
		System.out.println("in  Package3 Test2 class - After Method");
	}

	@BeforeClass(groups = "sanity")
	void befClass()
	{
		System.out.println("**************** Before Package3 Test2 class methods ********************* ");
	}
	@AfterClass
	void aftClass()
	{
		System.out.println("**************** After Package3 Test2 class methods ********************** ");
	}
	
	
	
}
