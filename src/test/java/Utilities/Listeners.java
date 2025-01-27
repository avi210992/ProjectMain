package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listeners implements ITestListener {
	
	static ExtentReports extent = ExtentReportTest.getReport();
	static ThreadLocal<ExtentTest> tl = new ThreadLocal<ExtentTest>();
	ExtentTest extest;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
System.out.println("TEST STARTED - listeners code invoked");
extest=	extent.createTest(result.getMethod().getMethodName());
tl.set(extest);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("TEST SUCCESS - listeners SUCCESS code invoked");	
		System.out.println(result.getName()  + "@@@@@" + result.getStatus());
		tl.get().pass("PASSED");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("TEST FAILED - listeners FAILURE code invoked");	
		System.out.println(result.getName()  + "@@@@@" + result.getStatus());
		
		try {
			result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("TEST FOLDER START - listeners  code invoked");	
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("TEST FOLDER END - listeners  code invoked");	
		extent.flush();
	}
	
	
}
