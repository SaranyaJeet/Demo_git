package generic;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DATA1lisenerclass implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("skipped");
	}
	
	

}
