package c;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//@Listeners(c.Listener.class)
public class ExtentReportsClassTest extends Base{
		
//	@Test
//	public void passTest(){
//		System.out.println("********** 3");
//		int x = 0;
//		Listener.getLogger().log(LogStatus.PASS, "clicked on enroll now");
//		Assert.assertTrue(true);
//		Listener.getLogger().log(LogStatus.PASS, "sponsor searched");
//	}
//	
//	@Test
//	public void failTest(){
//		int x = 1;
//		Listener.getLogger().log(LogStatus.PASS, "clicked on enroll now");
//		Assert.assertTrue(false);
//		
//	}
	
	@Test
	public void test1(){
		Assert.assertTrue(true,"m1");
	}
	
	@Test
	public void test2(){
		Assert.assertTrue(false,"m2");
	}
	
	@Test
	public void test3(){
		Assert.assertTrue(true,"m3");
	}
	
	
}