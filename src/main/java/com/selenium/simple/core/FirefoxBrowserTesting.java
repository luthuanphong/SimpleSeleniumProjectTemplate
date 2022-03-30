package com.selenium.simple.core;

import com.selenium.simple.core.driver.Initializer.FirefoxWebDriverInitializer;
import com.selenium.simple.core.driver.wrapper.Interface.IDriverWrapper;
import org.testng.annotations.Listeners;

@Listeners(FirefoxWebDriverInitializer.class)
public class FirefoxBrowserTesting extends BaseAutomationTesting {
    @Override
    protected IDriverWrapper createWrapperIfNull() {
        return FirefoxWebDriverInitializer.getDriverWrapper();
    }
}
