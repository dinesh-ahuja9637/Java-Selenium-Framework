package com.org_name.tests;

import com.aventstack.extentreports.Status;
import com.org_name.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class TestHomePage extends BaseTest {
private HomePage homePage = new HomePage();
    //private static final Logger logger = (Logger) LoggerFactory.getLogger(TestHomePage.class);
    @Test
    public void testHomePage()
    {

        //Logger pLogger = LogManager.getLogger("programmaticLogger");
        //System.setProperty("log4j.configurationFile");


        Logger log = LogManager.getLogger(TestHomePage.class.getName());
        log.debug("Programmatic Logger Message");
        homePage.setEnterText();
        //BaseTest.extent.createTest("testHomePage").pass("Test Passed");

    }
}
