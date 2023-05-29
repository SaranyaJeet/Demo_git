package qsp;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Repotes
{
	@Test
	public void test1()
	{
		ExtentReports rep=new ExtentReports("./rep/r1.htlm");
		ExtentTest test =rep.startTest("tc1");
		test.log(LogStatus.PASS, "pass");
		test.log(LogStatus.FAIL,"fail");
		test.log(LogStatus.SKIP,"skip");
		rep.endTest(test);
		rep.flush();
	}

}
