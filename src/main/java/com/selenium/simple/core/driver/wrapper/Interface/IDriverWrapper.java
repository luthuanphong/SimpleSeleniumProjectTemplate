package com.selenium.simple.core.driver.wrapper.Interface;

import org.openqa.selenium.WebDriver;

public interface IDriverWrapper {
	public void release();
	public WebDriver getDriver(); 
	public IDriverExtension getDriverEx();
}
