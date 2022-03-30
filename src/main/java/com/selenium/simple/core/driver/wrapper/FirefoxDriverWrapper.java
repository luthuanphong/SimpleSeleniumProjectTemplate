package com.selenium.simple.core.driver.wrapper;

import com.selenium.simple.core.driver.Manager.WebDriverManager;
import com.selenium.simple.core.driver.wrapper.Interface.IDriverExtension;

public class FirefoxDriverWrapper extends BaseDriverWrapper{

    public FirefoxDriverWrapper() {
        super(WebDriverManager.GetFireFoxDriver());
    }

    public FirefoxDriverWrapper(IDriverExtension extension) {
        super(WebDriverManager.GetFireFoxDriver(), extension);
    }
}
