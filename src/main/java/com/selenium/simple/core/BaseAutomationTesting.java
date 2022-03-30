package com.selenium.simple.core;

import com.selenium.simple.core.driver.wrapper.Interface.IDriverWrapper;

public abstract class BaseAutomationTesting {
	
	private IDriverWrapper wrapper;

	protected IDriverWrapper getWrapper() {
		if(this.wrapper == null)
			this.wrapper = this.createWrapperIfNull();

		return this.wrapper;
	}
	
	protected abstract IDriverWrapper createWrapperIfNull();
}
