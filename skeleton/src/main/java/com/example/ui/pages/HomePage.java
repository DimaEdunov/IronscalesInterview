package com.example.ui.pages;

import com.example.ui.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Example method to get the page title
    public String getPageTitle() {
        return driver.getTitle();
    }

    // You can add more methods for interactions on the home page here
}
