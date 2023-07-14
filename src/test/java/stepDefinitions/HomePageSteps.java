package stepDefinitions;

import com.pages.HomePage;

import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.ScrollUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HomePageSteps {
    private static String title1;
    private final HomePage homePage;
    private final WebDriver driver;
    private static ScrollUtils scrollUtils;

    public HomePageSteps() throws IOException, InvalidFormatException {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(DriverFactory.getDriver());
        scrollUtils = new ScrollUtils(DriverFactory.getDriver());
    }

    @Given("user is in the Homepage")
    public void user_is_in_homepage() {
        driver.get("https://kapiva.in/");
        // System.out.println(driver.getCurrentUrl());
    }

    @When("user clciks on Login button")
    public void user_clciks_on_login_button() throws InterruptedException {
        Thread.sleep(3000);
        homePage.clickOnLogin();
    }

    @Then("the text {string} should be on the login page")
    public void the_text_should_be_on_the_login_page(String welcometext) {
        String msg = homePage.isWelcometextExist();
        Assert.assertEquals(msg, welcometext);
        System.out.println(msg);
    }

    @When("user clciks on Get App button")
    public void user_clciks_on_get_app_button() {
        homePage.ClickOnGetAppbutton();
    }

    @Then("user gets the title of the page should be {string}")
    public void user_gets_the_title_of_the_page_should_be(String expectedTitleofgetApppage) {
        title1 = homePage.getAppPageTitle();
        System.out.println("Page title is: " + title1);
        Assert.assertTrue(title1.contains(expectedTitleofgetApppage));
    }

//    @When("user clicks on Each concerns with {int}")
//    public void user_clicks_on_concern(int concernNum) throws InterruptedException {
//        homePage.Clickonconecrn(concernNum);
//    }

    @Then("user scrolls down")
    public void user_scrolls_down() throws InterruptedException {
        Thread.sleep(3000);
        scrollUtils.scrollByPixel(600);
        Thread.sleep(3000);
    }

    @And("user should see the product with the Himalayan Shilajit Resin")
    public void user_should_see_the_product_with_the_himalayan_shilajit_resin(String ProductName) throws InterruptedException {
        String actualproductname = homePage.getPopularProduct(ProductName);
        System.out.println(actualproductname);
    }

    @And("user should see the product with the {string}")
    public void userShouldSeeTheProductWithThe(String ProductName) {
        String actualproductname = homePage.getPopularProduct(ProductName);
        System.out.println(actualproductname);
        Assert.assertEquals(ProductName, actualproductname);
    }

    @When("user clicks on trackorder button")
    public void user_clicks_on_trackorder_button() {
        homePage.clcikontarckorder();
    }

    @Then("the user checks the title of the page should be {string}")
    public void the_user_checks_the_title_of_the_page_should_be(String actualtrackordertitle) {
        String expectedtrackorderpagetitle = homePage.gettrackorderpagetitle();
        Assert.assertEquals(expectedtrackorderpagetitle, actualtrackordertitle);
        System.out.println(expectedtrackorderpagetitle);
    }

    @When("user clciks on Hamberger menu button")
    public void userClciksOnHambergerMenuButton() {
        homePage.clickonhamegermenu();
    }

    @And("user clicks on the login button in the Hamerger menu")
    public void userClicksOnTheLoginButtonInTheHamergerMenu() throws InterruptedException {
        homePage.clcikonhambergerloginbutton();
    }

    @Then("the user checks the current url of the page should be {string}")
    public void theUserChecksTheCurrentUrlOfThePageShouldBe(String actualloginpageurl) throws InterruptedException {
        Thread.sleep(3000);
        String expectedpageurl = homePage.getloginpageurl();
        Assert.assertEquals(expectedpageurl, actualloginpageurl);
        System.out.println(expectedpageurl);
    }

    @When("user clicks on the View all paticular {string} in the homepage")
    public void userClicksOnTheViewAllPaticularInTheHomepage(String Concern) {
        homePage.clickonlink(Concern);
    }

    @Then("user will verify the {string} of the particular concern")
    public void userWillVerifyTheOfTheParticularConcern(String actualconcernpagetitle) {
        String expectedconcernpagetitle = homePage.getconcernpagetitle();
        boolean exp = expectedconcernpagetitle.contains(actualconcernpagetitle);
        Assert.assertTrue(exp);
        System.out.println(exp);
    }

    @And("user navigate to home page")
    public void userNavigateToHomePage() throws InterruptedException {
        Thread.sleep(3000);
        homePage.navigateback();
        Thread.sleep(5000);
    }

    @And("user clciks on the View all link of particular {string} in the homepage")
    public void userClciksOnTheViewAllLinkOfParticularInTheHomepage(String concernurl) {
        scrollUtils.scrollByPixel(-200);
        homePage.clickonviewlink(concernurl);
    }

//    @When("user clicks on Each concerns with sheetname {string} and rownumber {int}")
//    public void user_clicks_on_each_concerns_with_sheetname_and_rownumber(String sheetName Integer rownumber) throws IOException, InvalidFormatException {
//        ExcelReader reader = new ExcelReader();
//        List<Map<String,String>> testData =
//                reader.getData("webAutoData.xlsx", sheetName);
//
////         homePage.Clickonconecrn();
//}



}






