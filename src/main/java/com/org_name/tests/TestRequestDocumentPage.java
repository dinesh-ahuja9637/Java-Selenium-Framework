package com.org_name.tests;

import com.org_name.pages.BasePage;
import com.org_name.pages.DocumentsRequestPage;
import com.org_name.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRequestDocumentPage extends BaseTest{

    private HomePage homePage = new HomePage();
    private BasePage basePage = new BasePage();
    private DocumentsRequestPage documentsRequestPage = new DocumentsRequestPage();

    @Test
    public void testRequestDocumentPae()
    {
        homePage.setEnterText();
        documentsRequestPage.navigateToRequestPage();
        Assert.assertTrue(documentsRequestPage.getTitleOfRequestPage().equals("ABCD"),"Title is not matching on this page kindly check");
    }
}
