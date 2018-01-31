package c;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {
	protected  Listener l;
	
	@BeforeSuite
	public void startReport(){
		//ExtentReports(String filePath,Boolean replaceExisting) 
		//filepath - path of the file, in .htm or .html format - path where your report needs to generate. 
		//replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
		//True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
		//False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
	
		//extent.addSystemInfo("Environment","Environment Name")
		System.out.println("********** 2");
                 l = new Listener();
	}
	
	@AfterMethod
	public void getResult(){
		System.out.println("********** 4");
			Listener.getExtent().endTest(Listener.getLogger());
	}
	
	@AfterSuite
	public void as(){
		System.out.println("********** 4");
			Listener.getExtent().flush();
	         //Call close() at the very end of your session to clear all resources. 
	         //If any of your test ended abruptly causing any side-affects (not all logs sent to ExtentReports, information missing), this method will ensure that the test is still appended to the report with a warning message.
	         //You should call close() only once, at the very end (in @AfterSuite for example) as it closes the underlying stream. 
	         //Once this method is called, calling any Extent method will throw an error.
	         //close() - To close all the operation
			Listener.getExtent().close();
	}
	
}
