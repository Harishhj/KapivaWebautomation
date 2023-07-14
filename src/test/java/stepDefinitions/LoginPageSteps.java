package stepDefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPageSteps {
    private static String title;
    private static WebDriver driver;
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user on the login page")
    public void user_on_the_login_page() {
        DriverFactory.getDriver().get("https://kapiva.in/login.php");
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = loginPage.getLoginPageTitle();
        System.out.println("Page title is: " + title);
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitleName) {
        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @When("user enters the phonenumber {string}")
    public void user_enters_the_phonenumber(String number) {
        loginPage.enterphonenum(number);
    }

    @And("user clciks on submit button")
    public void user_clciks_on_submit_button() throws InterruptedException {
        loginPage.clickonsubmitbutton();
    }

    @And("user enters the otp {string}")
    public void user_enters_the_otp(String otp) throws InterruptedException {
        loginPage.enterotp(otp);
    }

    @And("user clciks on otp submit button")
    public void user_clciks_on_otp_submit_button() throws InterruptedException {
     loginPage.clickonsubmitbutton0tp();
    }

    @And("user moves the mouse pointer on the MY Account section")
    public void user_moves_the_mouse_pointer_on_the_my_account_section() {
        Actions actions = new Actions(driver);
        WebElement movemouse = loginPage.movemousepointer();
        actions.moveToElement(movemouse).perform();
    }

    @Then("the user name should be {string} in the my acount section")
    public void the_user_name_should_be_in_the_my_acount_section(String string) {

    }

}