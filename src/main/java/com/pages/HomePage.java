package com.pages;

import com.qa.util.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HomePage {

        private static WebDriver driver;

        ExcelReader reader = new ExcelReader();



        private final By login_button = By.linkText("LOGIN");
        private final By Welcome_text = By.className("pink");
        private final By getapp_button = By.linkText("GET APP");
        private final By trackorder_button = By.cssSelector("svg[viewBox='0 0 26.08 18.923']");
        private final By hamberegr_button = By.xpath("//button[contains(@class,'lg:order-2 px-1 h-full')]");

        private final By hlogin_button = By.xpath("//span[@class='text-white hover:text-white']");


        public HomePage(WebDriver driver) throws IOException, InvalidFormatException {
                HomePage.driver = driver;
        }

        public String isWelcometextExist() {
                return driver.findElement(Welcome_text).getText();
        }

        public void clickOnLogin() {
                driver.findElement(login_button).click();
        }

        public void ClickOnGetAppbutton() {
                driver.findElement(getapp_button).click();
        }

        public void Clickonconecrn(String sheetName, int rownumber) throws IOException, InvalidFormatException {
                List<Map<String,String>> testData =
                        reader.getData("webAutoData.xlsx", sheetName);
                driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/section[2]/div[1]/div[1]/div[" + testData.get(rownumber).get("ConcernNum") + "]")).click();
        }

        public String getAppPageTitle() {
                return driver.getTitle();
        }

        public String getPopularProduct(String Productname) {
                WebElement actualproductname = driver.findElement(By.xpath(("//h1[@class='kp-show-2line text-[length:var(--text-base)] font-normal leading-[1.2] hover:text-[color:var(--cr-primary)] lg:text-[length:var(--text-lg)] " +
                        "lg:leading-[1.3] lg:tracking-[0.30px]' and text()='" + Productname + "']")));
                String actual = actualproductname.getText();
                return actual;
        }

        public void clcikontarckorder() {
                driver.findElement(trackorder_button).click();
        }

        public String gettrackorderpagetitle() {
                return driver.getTitle();
        }

        public void clickonhamegermenu() {
                driver.findElement(hamberegr_button).click();
        }

        public void clcikonhambergerloginbutton() {
                driver.findElement(hlogin_button).click();
        }
        public String getloginpageurl(){
                return driver.getCurrentUrl();
        }

        public void  clickonlink( String Concern){
                driver.findElement(By.partialLinkText( Concern )).click();
        }
        public String getconcernpagetitle(){

                return driver.getTitle();
        }
        public void navigateback(){
                driver.navigate().back();
        }
        public void clickonviewlink(String concernurl){
                driver.findElement(By.xpath("//a[@href='https://kapiva.in/"+concernurl+"/']")).click();
        }
}
