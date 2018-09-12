package step_definition;

import DriverInstance.driverInstance;
import Pages.WelcomePage;
import Pages.landingPage;
import Pages.loginPage;
import Pages.tutorPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class parentFormTest extends driverInstance {
    landingPage lp = new landingPage(driver);
    loginPage log = new loginPage(driver);
    WelcomePage wp = new WelcomePage(driver);
    tutorPage tp = new tutorPage(driver);

    @Given("^I am on the MyTutor landing page$")
    public void i_am_on_the_MyTutor_landing_page() throws Throwable {
        System.out.println("This is a test to find a tutor");
    }

    @When("^I click on login$")
    public void i_click_on_login() throws Throwable {
        lp.clickLoginButton();
    }

    @When("^I select the parent button$")
    public void i_select_the_parent_button() throws Throwable {
        log.AssertParentLoginPage();
        log.selectParent();
    }

    @When("^I enter my valid email and password$")
    public void i_enter_my_valid_email_and_password() throws Throwable {
        log.enterEmail("bukiamu@yahoo.com");
        log.enterPassword("angel2010");
    }

    @When("^I click on the second login button$")
    public void i_click_on_the_second_login_button() throws Throwable {
        log.selectLogin2();
    }

    @When("^I select on Find A tutor$")
    public void i_select_on_Find_A_tutor() throws Throwable {
        wp.AssertWelcomeMessage();
        wp.selectFindTutor();
    }

    @When("^I select the subject of choice$")
    public void i_select_the_subject_of_choice() throws Throwable {
        tp.AssertTutorPage();
        tp.searchSubject();
    }

    @When("^I select the Level$")
    public void i_select_the_Level() throws Throwable {
        tp.searchLevel();
    }

    @And("^I select a gender$")
    public void iSelectAGender() throws Throwable {
       tp.selectGender();
    }

    @When("^I select any of the displayed options$")
    public void i_select_any_of_the_displayed_options() throws Throwable {

    }

    @When("^I select and write in their message body$")
    public void i_select_and_write_in_their_message_body() throws Throwable {

    }


    @When("^I click on Send Message$")
    public void i_click_on_Send_Message() throws Throwable {


    }

    @Then("^the Message sent icon should be displayed$")
    public void the_Message_sent_icon_should_be_displayed() throws Throwable {

    }


}