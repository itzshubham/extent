package c;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Listener implements ITestListener {
	protected static  ExtentTest logger;
	protected static  ExtentReports extent;

	public void onFinish(ITestContext arg0) {
	    
		
	}

	public void onStart(ITestContext it) {
		System.out.println("********** 1");
		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/autoRepo.html", true);
		extent
        .addSystemInfo("Host Name", "xyz")
        .addSystemInfo("Environment", "QA")
        .addSystemInfo("User Name", "jenkins");
        //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
        //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
        extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult tr) {
		logger.log(LogStatus.FAIL, "");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult tr) {
		System.out.println("********** 16666666666");
		logger = extent.startTest(tr.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult arg0) {
	
		
	}
	
	public static  ExtentTest getLogger(){
		return logger;
	}
	
	public static ExtentReports getExtent(){
		return extent;
	}

}
