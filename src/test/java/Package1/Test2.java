package Package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	public void m1()
	{
		System.out.println("in Package1 Test2 class and Testmethod m1");
	}
	
	@Test (groups = "sanity")
	public void m2()
	{
		System.out.println("in  Package1 Test2 class and Testmethod m2");
	}
	
	@Test
	public void m3()
	{
		System.out.println("in Package1 Test2 class and Testmethod m3");
	}
	
	@BeforeMethod
	public void BefMeth()
	{
		System.out.println("in  Package1 Test2 class - Before Method");
	}
	
	@AfterMethod(groups = "sanity")
	public void AftMeth()
	{
		System.out.println("in  Package1 Test2 class - After Method");
	}
	
	@BeforeClass(groups = "sanity")
	void befClass()
	{
		System.out.println("**************** Before package1 Test2 class methods ********************* ");
	}
	@AfterClass
	void aftClass()
	{
		System.out.println("**************** After package1 Test2 class methods ********************** ");
	}
	
	
	
}
