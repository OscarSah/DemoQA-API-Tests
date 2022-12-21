package com.demoqa.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class GetAllBooksSteps {

    Response response;

    @When("User sends GET request to receive all books information")
    public void user_sends_get_request_to_receive_all_books_information() {
        response = RestAssured.given().accept(ContentType.JSON)
                .get("BookStore/v1/Books");
       //  response.prettyPrint();
    }
    @Then("Verifies that application returns {int} results")
    public void verifies_that_application_returns_results(int expectedBookAmount) {
        // jsonPath method
        JsonPath jsonPath = response.jsonPath();
        List<Object> books = jsonPath.getList("books");
        System.out.println("books.size() = " + books.size());
        Assert.assertEquals(expectedBookAmount,books.size());

        // Collections
        Map<String,Object> responseMap = response.as(Map.class); // De-Serialization -- First level of information
    //    System.out.println("responseMap = " + responseMap);

        List<Map<String,Object>> booksList = (List<Map<String, Object>>) responseMap.get("books");
        System.out.println("booksList = " + booksList.size());
        Assert.assertEquals(expectedBookAmount,booksList.size());
    }
}
