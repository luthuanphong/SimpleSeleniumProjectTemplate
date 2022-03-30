package com.selenium.simple.core;

import com.selenium.simple.core.driver.Initializer.ChromeWebDriverInitializer;
import com.selenium.simple.core.driver.wrapper.Interface.IDriverWrapper;
import org.testng.annotations.Listeners;

@Listeners(ChromeWebDriverInitializer.class)
public class ChromeBrowserTesting extends BaseAutomationTesting {
    @Override
    protected IDriverWrapper createWrapperIfNull() {
        return ChromeWebDriverInitializer.getDriverWrapper();
    }
}
