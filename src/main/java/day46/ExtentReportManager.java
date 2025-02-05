package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener 
{

	public ExtentSparkReporter sparkReporter; // Ui of the Report
	public ExtentReports extent; // populate common info on the report
	public ExtentTest test; // creating test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext context) {
		
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Reoprt"); // Title of the report
		sparkReporter.config().setReportName("Functional Testig"); // Name of the report
		sparkReporter.config().setTheme(Theme.STANDARD); //DARK
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester name", "Anilkumar");
		extent.setSystemInfo("os", "Window10");
		extent.setSystemInfo("Browser name", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result) {
			
		test=extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.PASS, "Test case PASSED is :" + result.getName()); // update status p/f/s
	}
	
	public void onTestFailure(ITestResult result) {
		
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is :" + result.getName()); 
		test.log(Status.FAIL, "Test case FAILED cause is :" + result.getThrowable()); // error message
	}
	
	public void onTestSkipped(ITestResult result) {
		
		test=extent.createTest(result.getName()); 
		test.log(Status.SKIP, "Test case SKIPPED is :" + result.getName());
	}
	
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
	
}
