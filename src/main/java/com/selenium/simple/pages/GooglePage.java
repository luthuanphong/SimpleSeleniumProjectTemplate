package com.selenium.simple.pages;

import com.selenium.simple.core.driver.wrapper.Interface.IDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GooglePage {

    private By text = By.name("q");

    private By click = By.name("btnK");

    private By title = By.tagName("h3");

    private IDriverWrapper wrapper;

    public GooglePage(IDriverWrapper wrapper) {
        this.wrapper = wrapper;
    }

    public void Search(String content) {
        this.wrapper.getDriver().findElement(text).sendKeys("zing");
        this.wrapper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        this.wrapper.getDriver().findElement(click).click();
        this.wrapper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public String getResult() throws InterruptedException {
        this.wrapper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return this.wrapper.getDriver().findElement(title).getText();
    }
}
