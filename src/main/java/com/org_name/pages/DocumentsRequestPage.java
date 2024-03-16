package com.org_name.pages;


import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class DocumentsRequestPage extends BasePage {

    private By documentRequestPageLink = By.linkText("Free Access to InterviewQues/ResumeAssistance/Material");
    String expectedTitle = "RS Academy";
    private String title;

    public void navigateToRequestPage()
    {
        click(documentRequestPageLink);
    }

    public String getTitleOfRequestPage()
    {
        return title = getTitle();
    }
}
