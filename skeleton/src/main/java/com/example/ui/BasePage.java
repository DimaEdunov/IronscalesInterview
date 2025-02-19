package com.example.ui;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        // Set wait timeout as needed
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Common methods for page objects can be added here
}
