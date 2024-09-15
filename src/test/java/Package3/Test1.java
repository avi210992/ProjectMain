package Package3;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@Parameters({"param1", "param2"})
	@Test ()
	public void m1(String s1, int i1)
	{
		System.out.println("in Package3 Test1 class and Testmethod m1" + " and the Thread executing this method is " + Thread.currentThread().getName());
		System.out.println(" the parameters read are " + s1 + "$$$$$" + "  " + i1);
	}
	
	@Parameters({"str","int1"})
	@Test(groups = "sanity")
	public void m2(String str, int int1)
	{
		System.out.println("in Package3 Test1 class and Testmethod m2  and the Thread executing this method is " + Thread.currentThread().getName());
		System.out.println("PARAMETERISATION DATA is   "+str + "^^^^" + int1 );
	}
	
	@Test (dataProvider = "dataP1")
	public void m3(String name , String age)
	{
		System.out.println("in  Package3 Test1 class and Testmethod m3" + " and the Thread executing this method is " + Thread.currentThread().getName());
		System.out.println("EXECUTING DATAPROVIDER $$$$$$$$$");
		System.out.println("Name of the person is  " + name + " and Age of person is   " + age);
	}
	
	@BeforeMethod ()
	public void Befmeth()
	{
		System.out.println("in Package3 Test1 class - BEFORE METHOD");
		Reporter.log("Logging the executions before every method invoked" , true);
	}
	
	@AfterMethod (groups = "sanity")
	public void Aftmeth()
	{
		System.out.println("in Package3 Test1 class - AFTER METHOD");
	}
	
	@DataProvider (name = "dataP1")
	public Object[][] data()
	{
		
		Object[][] arr1 =new Object[3][2];
		arr1[0][0] = "Avinash";
		arr1[0][1] = "32";
		arr1[1][0] = "Hari";
		arr1[1][1] = "28";
		arr1[2][0] = "Jerry";
		arr1[2][1] = "21";
		
		return arr1;
	}
	
//	@BeforeGroups
//	void befGrp()
//	{
//		System.out.println("Before ANY GROUP ^^^^^^^^^^^^^^^^");
//	}
	
}
