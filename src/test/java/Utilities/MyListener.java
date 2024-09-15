package Utilities;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class MyListener implements IHookable{

	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {

		Object[] params= callBack.getParameters();
		
	
		
	}

	
	
	
}
