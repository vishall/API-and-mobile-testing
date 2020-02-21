package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.PropertiesReader;

import java.util.Properties;

import static io.restassured.RestAssured.given;


public class GetCapitalCityStepDefs {



    @Given("I hit the get call for the capital city")
    public void i_hit_the_get_call_for_the_capital_city() {

        RestAssured.baseURI = PropertiesReader.getProperty("config","baseUrl");
        given().get();

    }


    @Then("I get a response for respective capital city")
    public void i_get_a_response_for_respective_capital_city() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("I extracted the capital city from the response")
    public void i_extracted_the_capital_city_from_the_response() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("I display the response on the console")
    public void i_display_the_response_on_the_console() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
