package com.selenium.simple.testcases;

import com.selenium.simple.core.ChromeBrowserTesting;
import com.selenium.simple.pages.GooglePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GoogleTest extends ChromeBrowserTesting {

    @BeforeClass
    public void setUp() {
        this.getWrapper().getDriver().get("https://www.google.com");
    }

    @AfterClass
    public void tearDown() {
        this.getWrapper().getDriver().quit();
    }

    @Test
    public void searchZing() throws InterruptedException {
        GooglePage page = new GooglePage(this.getWrapper());
        page.Search("zing");
        String result = page.getResult();
        Assert.assertTrue(result.contains("Zing"));
    }
}
