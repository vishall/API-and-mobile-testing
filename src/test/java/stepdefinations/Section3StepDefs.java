package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.json.JSONArray;
import utils.PropertiesReader;
import static io.restassured.RestAssured.given;

public class Section3StepDefs {

    @Given("I hit the get call for the capital city")
    public void i_hit_the_get_call_for_the_capital_city() {
        RestAssured.baseURI = PropertiesReader.getProperty("config","baseUrl");

                              given().
                                get();
    }

    @And("I get a response for respective capital city")
    public void i_get_a_response_for_respective_capital_city() {
        ValidatableResponse response =  given()
                                         .get()
                                        .then()
                                  .assertThat()
                                  .statusCode(200);
    }

    @When("I extracted the capital city from the response")
    public void i_extracted_the_capital_city_from_the_response() {
        Response response = given()
                             .get();

        JSONArray JSONResponseBody = new   JSONArray(response.body().asString());
        JSONResponseBody.getJSONObject(0).get("capital");

    }

    @Then("I display the response on the console")
    public void i_display_the_response_on_the_console() {
        Response response = given()
                             .get();
        JSONArray jsonArray = new   JSONArray(response.body().asString());
        String Capital = String.valueOf(jsonArray.getJSONObject(0).get("capital"));
        System.out.println("Capital city is: "+Capital);
    }

    @Then("I verify {string} presence in the response")
    public void i_verify_presence_in_the_response(String string) {
        Response response = given()
                             .get();

        if(response.body().asString().contains(string)){
            System.out.println("True, "+string+" is present in the response");
        }
        else
            System.out.println("False, unfortunately "+string+" is not present in the response");

    }

}
