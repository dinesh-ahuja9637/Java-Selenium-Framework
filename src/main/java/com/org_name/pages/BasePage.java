package com.org_name.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.*;

import java.io.File;
import java.io.IOException;

public class BasePage {

    public static WebDriver webDriver;

    public void setUpWebDriver(WebDriver webDriver)
    {
        BasePage.webDriver = webDriver;
    }

    protected void takeScreenshot(String name) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File f = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f,new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+name+".PNG"));
    }

    protected WebElement findElement(By locator)
    {
        return webDriver.findElement(locator);
    }

    protected void setText(By locator, String text)
    {
        findElement(locator).sendKeys(text);
    }

    protected void click(By locator)
    {
        findElement(locator).click();
    }

    protected String getTitle()
    {
        return webDriver.getTitle();
    }
}
