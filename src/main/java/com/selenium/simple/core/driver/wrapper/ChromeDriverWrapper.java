package com.selenium.simple.core.driver.wrapper;

import com.selenium.simple.core.driver.Manager.WebDriverManager;
import com.selenium.simple.core.driver.wrapper.Interface.IDriverExtension;

public class ChromeDriverWrapper extends BaseDriverWrapper{
    public ChromeDriverWrapper() {
        super(WebDriverManager.GetChromeDriver());
    }

    public ChromeDriverWrapper(IDriverExtension extension) {
        super(WebDriverManager.GetChromeDriver(), extension);
    }
}
