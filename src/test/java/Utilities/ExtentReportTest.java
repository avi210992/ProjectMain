package Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {
	

public static ExtentReports getReport()
{
	  LocalDateTime localDate = LocalDateTime.now();
      DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("MM_dd_YYYY");
      String time = dateformatter.format(localDate);
	String path = System.getProperty("user.dir")+"\\target\\"+"indexReport"+time+".html";
	ExtentSparkReporter spark = new ExtentSparkReporter(path);
	
	ExtentReports extent = new ExtentReports();
	
	extent.attachReporter(spark);
	return extent;

}


}
