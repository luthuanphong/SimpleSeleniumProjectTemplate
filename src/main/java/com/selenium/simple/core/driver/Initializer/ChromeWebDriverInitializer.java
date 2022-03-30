package com.selenium.simple.core.driver.Initializer;

import com.selenium.simple.core.driver.wrapper.ChromeDriverWrapper;

public class ChromeWebDriverInitializer extends WebDriverInitializer{

    @Override
    protected void initializeDriverWrapper() {
        wrapper = new ChromeDriverWrapper();
    }

}
