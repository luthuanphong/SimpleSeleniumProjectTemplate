package com.selenium.simple.core.driver.wrapper;

import com.selenium.simple.core.driver.wrapper.Interface.IDriverExtension;
import org.openqa.selenium.WebDriver;

public class DefaultDriverExtension implements IDriverExtension {
	
	/**
	 * Web driver
	 */
	private WebDriver driver;
	
	/**
	 * Create Web driver extension
	 * @param driver
	 */
	public DefaultDriverExtension(WebDriver driver) {
		if (driver == null)
			throw new IllegalArgumentException("Web driver can not be NULL.");
		
		this.driver = driver;
	}

	/**
	 * Create empty Wrapper. We might set web driver later
	 */
	public DefaultDriverExtension() {}

	/**
	 * Set web driver for increasing flexibility
	 * @param driver
	 */
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
