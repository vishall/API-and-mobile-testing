package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Section2Page;
import java.net.MalformedURLException;

    public class Section2StepDefs extends BaseClass  {

    private Section2Page section2Page = new Section2Page(null);

    @Given("open the application")
    public void open_the_application() throws MalformedURLException {
        setUp();
    }

    @When("app is loaded successfully")
    public void app_is_loaded_successfully() {
        section2Page.isAppLoaded();
    }

    @Then("verify the images and text is getting displayed correctly")
    public void verify_the_images_and_text_is_getting_displayed_correctly() {

    }

    @When("swipe the screen")
    public void swipe_the_screen() {
        section2Page.swipeScreen();
    }
    @Then("should get navigate to correct {string}")
    public void should_get_navigate_to_correct(String page) {
        section2Page.navigateToScreen(page);
    }

    @And("click on get started button")
    public void click_on_get_started_button() {

    }

    @When("verify terms of service link is present")
    public void verify_terms_of_service_link_is_present() {

    }

    @When("click on terms of service link")
    public void click_on_terms_of_service_link() {

    }

    @Then("verify respective pop up should display correctly")
    public void verify_respective_pop_up_should_display_correctly() {

    }

    @When("verify privacy policy link is present")
    public void verify_privacy_policy_link_is_present() {

    }

    @When("click on privacy policy link")
    public void click_on_privacy_policy_link() {

    }

    @When("select radio button option")
    public void select_radio_button_option() {

    }

    @When("click on continue button")
    public void click_on_continue_button() {

    }

    @When("should be abe to email text box")
    public void should_be_abe_to_email_text_box() {

    }

    @When("enter valid email address")
    public void enter_valid_email_address() {

    }

    @Then("{string} toast message should be displayed")
    public void toast_message_should_be_displayed(String string) {

    }

    @When("enter invalid email address")
    public void enter_invalid_email_address() {

    }

    @Then("{string} error message should be displayed")
    public void error_message_should_be_displayed(String string) {

    }

}
