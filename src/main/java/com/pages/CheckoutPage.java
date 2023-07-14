package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private static WebDriver driver;

    private final By search_box = By.id("search-box");


    public CheckoutPage(WebDriver driver) {
        CheckoutPage.driver = driver;
    }
    public void Clcikonsearchbox() {

        driver.findElement(search_box);

    }

}
