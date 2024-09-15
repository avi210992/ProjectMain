package Package2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void m1() {
		System.out.println("in Package2  Test1 class and Testmethod m1");
	}

	@Test
	public void m2() {
		System.out.println("in  Package2  Test1 class and Testmethod m2");
	}

	@Test
	public void m3() {
		System.out.println("in  Package2 Test1 class and Testmethod m3");
	}

	@BeforeMethod(alwaysRun = true)
	public void BefTest1() {
		System.out.println("in  Package2 Test1 class - Before Method");
	}

	@AfterMethod
	public void AftTest1() {
		System.out.println("in  Package2  Test1 class - After Method");
	}

}
