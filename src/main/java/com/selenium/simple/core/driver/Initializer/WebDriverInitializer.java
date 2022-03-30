package com.selenium.simple.core.driver.Initializer;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import com.selenium.simple.core.driver.wrapper.Interface.IDriverWrapper;

public abstract class WebDriverInitializer implements ISuiteListener  {

	protected static IDriverWrapper wrapper;

	public void onStart(ISuite suite) {
		this.initializeDriverWrapper();
	}
	
	public void onFinish(ISuite suite) {
		wrapper.getDriver().quit();
	}

	protected abstract void initializeDriverWrapper();

	public static IDriverWrapper getDriverWrapper(){
		return wrapper;
	}
}
