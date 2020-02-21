package stepdefinations;

import io.cucumber.core.gherkin.vintage.internal.gherkin.deps.com.google.gson.JsonObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.PropertiesReader;

import java.util.Properties;

import static io.restassured.RestAssured.given;
import static io.restassured.parsing.Parser.JSON;


public class GetCapitalCityStepDefs {



    @Given("I hit the get call for the capital city")
    public void i_hit_the_get_call_for_the_capital_city() {

        RestAssured.baseURI = PropertiesReader.getProperty("config","baseUrl");
        given().get();

    }


    @Then("I get a response for respective capital city")
    public void i_get_a_response_for_respective_capital_city() {
        ValidatableResponse response =  given()
                .get()
                .then()
                .assertThat()
                .statusCode(200);
    }


    @Then("I extracted the capital city from the response")
    public void i_extracted_the_capital_city_from_the_response() {
        Response response = given().get();

        JSONArray JSONResponseBody = new   JSONArray(response.body().asString());
        JSONResponseBody.getJSONObject(0).get("capital");

    }


    @Then("I display the response on the console")
    public void i_display_the_response_on_the_console() {

        Response response = given().get();
        JSONArray JSONResponseBody = new   JSONArray(response.body().asString());
        String Capital = String.valueOf(JSONResponseBody.getJSONObject(0).get("capital"));
        System.out.println("Capital city is: "+Capital);
    }



}
