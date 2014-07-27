package org.owler.ui.steps;

import com.owler.ui.pages.HomePage;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kumaran on 7/26/14.
 */
public class HomePageSteps {


    private HomePage homePage;
    private WebDriver driver;



    @BeforeStories
    public void prepareStories()
    {
      driver= new FirefoxDriver(); // Need to implement Browser factory here.
    }
    @Given("owler home page")
    public void owler_home_page() {
      driver.manage().deleteAllCookies();
      driver.get("https://www.owler.com/");//App URL implementation
    }
    @When("I click the login button")
    public void I_click_the_login_button() {
    homePage= PageFactory.initElements(driver,HomePage.class);
    homePage.clickLoginLink();

    }

    @Then("system should display the login form")
    public void system_should_display_the_login_form() {
        homePage.isPopUpDisplayed();

    }
}
