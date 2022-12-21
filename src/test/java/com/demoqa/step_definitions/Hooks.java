package com.demoqa.step_definitions;

import com.demoqa.utils.ConfigurationReader;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {  // runs before and after every tests in cucumber framework, so I can setUp my BaseURI here

    @Before
    public void setUpApiRequest(){
        RestAssured.baseURI = ConfigurationReader.getProperty("apiUrl");
    }
}
