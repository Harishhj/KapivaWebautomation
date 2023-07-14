package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebDriver driver;
    private final By mobile_num = By.xpath("//input[@name='number']");
    private final By submit_button = By.id(":r1:");
    private final By otp_textbox = By.xpath("//*[@aria-label='Please enter verification code. Digit 1']");
    private final By otp_submit_button =By.xpath("//*[@class ='MuiTouchRipple-root css-w0pj6f']");
    private final By myaccount = By.linkText("MY ACCOUNT");




    public LoginPage(WebDriver driver) {
        LoginPage.driver = driver;
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void enterphonenum(String number){
        driver.findElement(mobile_num).sendKeys(number);
    }
    public void clickonsubmitbutton() throws InterruptedException {
        driver.findElement(submit_button).click();
        Thread.sleep(6000);
    }
    public void enterotp(String otp) throws InterruptedException {
        driver.findElement(otp_textbox).sendKeys(otp);
        Thread.sleep(10000);
    }
    public void clickonsubmitbutton0tp() throws InterruptedException {
        driver.findElement(otp_submit_button).click();
        Thread.sleep(5000);
    }
    public WebElement movemousepointer(){
        driver.findElement(myaccount);
        return null;
    }
}
