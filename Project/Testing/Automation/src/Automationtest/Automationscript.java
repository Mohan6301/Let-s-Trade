package Automationtest;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Pages.Backtohome;
import Pages.login;
import Pages.logout;
import Pages.ordering;
import Pages.shoppingsort;



public class  Automationscript{
	static WebDriver driver;
	public ExtentHtmlReporter reporter;
	public ExtentReports ext;
	public ExtentTest logger;

	@BeforeMethod
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\software\\msedgedriver.exe");
		driver = new EdgeDriver();
	}

	@BeforeTest
	public void setExtent() {
		reporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/Report.html");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("SampleReport");
		reporter.config().setReportName("FunctionalTest Report");
		ext = new ExtentReports();
		ext.attachReporter(reporter);
	}

	@AfterTest
	public void endReport() {
		ext.flush();
	}

	@Test(priority = 0)
	public void invalidlogin() {
		logger = ext.createTest("invalid credintials");
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		login v = new login(driver);
		v.logintoDashboard("standard_user", "secret_sauce1224324");
		String a=driver.getCurrentUrl();
		Assert.assertEquals(a, "https://www.saucedemo.com/inventory.html");
		
	}

	@Test(priority = 1)
	public void checkTitle1() {
		logger = ext.createTest("CheckTitle");
		driver.get("https://www.saucedemo.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Swag Labs");
	}

	

	@Test(priority = 2,description="The total functionality of the website is tested.")
	public void Totalmethod() throws InterruptedException {

		logger = ext.createTest("Login");
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		login v = new login(driver);
		v.logintoDashboard("standard_user", "secret_sauce");
		System.out.println("SucessfullyLogged into dashboard.");
		logger = ext.createTest("Sorting the cart");
		shoppingsort b = new shoppingsort(driver);
		b.shoppingsorting();
		System.out.println("An item is sucessfully added and removed from the cart.");
		logger = ext.createTest("Ordering");
		driver.navigate().back();
		ordering O = new ordering(driver);
		O.Orderingitems("Andrew", "Sun", "507303");
		logger = ext.createTest("Back to home");
		WebElement ele = driver.findElement(By.id("react-burger-menu-btn"));
		// driver.findElement(By.id("react-burger-menu-btn"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		act.click().build().perform();
		Backtohome c = new Backtohome(driver);
		c.backtoHome();
		logger = ext.createTest("Logout");
		logout l = new logout(driver);
		l.LogOut();
	}

	@Test(enabled = false)
	public void skip() {
		logger = ext.createTest("Skip");
		driver.get("http://adactinhotelapp.com/");
		driver.close();
	}

	@AfterMethod
	public void tearDownAfterClass(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, "Test Case Failed is" + result.getName());
			logger.log(Status.FAIL, "TestCase Failed due to" + result.getThrowable());
			String ScrnShot = capture(result.getName());
			logger.addScreenCaptureFromPath(ScrnShot);
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP, "Test Case is Skipped" + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, "TestCase is Passed" + result.getName());
		}
		driver.close();
	}

	public String capture(String ScrShtName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "/ErrorScreenShot/" + ScrShtName + ".png";
		try {
			File dest1 = new File(dest);
			FileUtils.copyFile(Screenshot, dest1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dest;

	}
}