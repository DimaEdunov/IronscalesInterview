package com.example.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    protected static WebDriver driver;

    @BeforeSuite
    public void globalSetUp() {
        // Use WebDriverManager to set up ChromeDriver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        // Add the flag to allow remote origins
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void globalTearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
