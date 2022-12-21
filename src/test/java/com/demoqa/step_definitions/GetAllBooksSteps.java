package com.demoqa.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllBooksSteps {

    Response response;

    @When("User sends GET request to receive all books information")
    public void user_sends_get_request_to_receive_all_books_information() {
        response = RestAssured.given().accept(ContentType.JSON)
                .get("BookStore/v1/Books");
        response.prettyPrint();
    }
    @Then("Verifies that application returns {int} results")
    public void verifies_that_application_returns_results(Integer int1) {

    }
}
