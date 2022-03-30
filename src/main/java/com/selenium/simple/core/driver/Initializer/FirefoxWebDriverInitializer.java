package com.selenium.simple.core.driver.Initializer;

import com.selenium.simple.core.driver.wrapper.FirefoxDriverWrapper;

public class FirefoxWebDriverInitializer extends WebDriverInitializer{

    @Override
    protected void initializeDriverWrapper() {
        wrapper = new FirefoxDriverWrapper();
    }
}
