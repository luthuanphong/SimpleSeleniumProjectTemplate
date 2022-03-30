package com.selenium.simple.core.driver.wrapper;

import com.selenium.simple.core.driver.wrapper.Interface.IDriverExtension;
import com.selenium.simple.core.driver.wrapper.Interface.IDriverWrapper;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;

public abstract class BaseDriverWrapper implements IDriverWrapper {
	/**
	 * WebDriver
	 */
	protected WebDriver driver;
	
	/**
	 * Driver extension methods 
	 */
	protected IDriverExtension driverEx;
	
	/**
	 * Create driver wrapper
	 * @param driver
	 */
	public BaseDriverWrapper(WebDriver driver) {

		if(driver == null)
			throw new InvalidArgumentException("WebDriver can not be Null.");

		this.driver = driver;
		this.driverEx = new DefaultDriverExtension(this.driver);
	}

	/**
	 * Create driver wrapper
	 * @param driver
	 * @param driverEx
	 */
	public BaseDriverWrapper(WebDriver driver, IDriverExtension driverEx) {
		if (driver == null)
			throw new InvalidArgumentException("WebDriver can not be NULL.");

		if (driverEx == null)
			throw new InvalidArgumentException("Driver extension can not be NULL.");

		this.driver = driver;
		this.driverEx = driverEx;
		this.driverEx.setDriver(driver);
	}

	/**
	 * Get WebDriver for using it's method
	 */
	public WebDriver getDriver() {
		return this.driver;
	}
	
	/**
	 * Get WebDriver Extension
	 */
	public IDriverExtension getDriverEx() {
		return this.driverEx;
	}

	/**
	 * Release WebDriver instance
	 */
	public void release() {
		if(this.driver != null)
			this.driver.quit();
		
		this.driver = null;
	}
}
