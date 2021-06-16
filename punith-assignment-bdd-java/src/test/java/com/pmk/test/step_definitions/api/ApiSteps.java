package com.pmk.test.step_definitions.api;

import com.pmk.test.framework.helpers.ApiHelper;
import com.pmk.test.models.api.ItemModel;
import com.pmk.test.models.api.ResponseModel;
import com.pmk.test.services.Api;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import static com.jayway.restassured.path.json.JsonPath.from;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Step Definition implementation class for Cucumber Steps defined in Feature file
 */

public class ApiSteps extends ApiHelper {
    private final ObjectMapper objectMapper = new ObjectMapper();

    private Response response;
    /*   Perform a HTTP GET request for a endpoint*/

    @When("^I perform GET request for \"([^\"]*)\" endpoint$")
    public void I_perform_GET_request_for_endpoint(String endpoint) {
        response = Api.getList(endpoint);
    }

    /*   Verify HTTP Status code from response*/

    @Then("^I get a (\\d+) http status code$")
    public void I_get_a_http_status_code(int statusCodeExpected) {
        assertThat(response.statusCode()).isEqualTo(statusCodeExpected);
    }

    @Then("^I get a \"([^\"]*)\" http contenttype$")
    public void I_get_a_http_content_type(String contentType) {
        assertThat(response.getContentType()).isEqualTo(contentType);
    }

    @Then("^I verify all the \"([^\"]*)\" with \"([^\"]*)\"$")
    public void I_verify_all_userid_title(String  param,String exp) {
        response = Api.compareItem(param,exp);
        System.out.println(response);
    }
}