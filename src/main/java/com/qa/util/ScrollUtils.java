package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollUtils {
    private WebDriver driver;
    private JavascriptExecutor jsExecutor;
    public ScrollUtils(WebDriver driver) {
        this.driver = driver;
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    public void scrollToBottom() {
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToTop() {
        jsExecutor.executeScript("window.scrollTo(0, 0)");
    }
    public void scrollByPixel(int pixel) {
        jsExecutor.executeScript("window.scrollBy(0, arguments[0])", pixel);
    }
    public void scrollToElement(String elementSelector) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id(elementSelector)));
    }

    public void scrollToPercentage(int percentage) {
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight * arguments[0] / 100)", percentage);
    }
}
