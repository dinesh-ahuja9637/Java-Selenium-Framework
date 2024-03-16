package com.org_name.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;
import com.org_name.pages.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.ResourceBundle;

public class BaseTest {

    private WebDriver webDriver;

    private BasePage basePage = new BasePage();
    String url;
    static ExtentReports extent;
    private static ExtentXReporter extentx;
    private static ExtentHtmlReporter html;
    @BeforeSuite
    public void suiteInitialize()
    {
        html = new ExtentHtmlReporter(".//src//main//resources//extent_report//Extent.html");
        extent = new ExtentReports();
        extent.attachReporter(html);
    }

    @AfterSuite
    public void afterSuite()
    {
        extent.flush();
    }
    @BeforeClass
    public void setUpDriver()
    {

        System.out.println("Before class");
        System.setProperty("webdriver.driver.chrome",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
        webDriver = new ChromeDriver();
        //basePage.setUpWebDriver(webDriver);
        ResourceBundle rd
                = ResourceBundle.getBundle("app-config");
        url=rd.getString("URL");

    }

    @BeforeMethod
    public void loadApplication()
    {
        basePage.setUpWebDriver(webDriver);
        //webDriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        webDriver.get(url);
        webDriver.manage().window().maximize();

    }

    @AfterMethod
    public void takeScreenshot(ITestResult iTestResult) throws IOException {
        if(iTestResult.getStatus() == ITestResult.FAILURE)
        {
            TakesScreenshot takesScreenshot = (TakesScreenshot)webDriver;
            File f = takesScreenshot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f,new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+iTestResult.getTestName()+".PNG"));
            extent.createTest(iTestResult.getName()).fail("Test failed").addScreenCaptureFromPath(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+iTestResult.getTestName()+".PNG");

        }
        else {
            extent.createTest(iTestResult.getName()).pass("Test Passed");

            //extent.pass("pass");
//extent.flush();
        }
    }

    @AfterTest
    public void afteTest()
    {
       // extent.flush();
    }

    @AfterClass
    public void closeDriver()
    {
        webDriver.quit();
        //extent.flush();
    }
}
