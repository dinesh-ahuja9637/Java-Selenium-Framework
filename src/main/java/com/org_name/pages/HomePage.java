package com.org_name.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private By enterText = By.xpath("//input[@name='enter-name']");

    public void setEnterText()
    {
        setText(enterText,"Dinesh");
    }
}
