# DemoQA Application Project Tests

## Goal of The Project

1. Create a framework that can be run through terminal and create a nice HTML report
2. Practice core components of Request and Response in API Testing

### pom.xml file
* Which dependencies we need?
    - RestAssured
    - Cucumber-java
    - Cucumber-junit
    - Object Mapper (Jackson, GSON)
    - Selenium, Boni-Garcia (No Need for API tests)
* Which plug-in for to be able to run from terminal our code?
    - Maven surefire plug-in
  
### API Tests:
* Two important topic to comprehend this type testing
  - How to send our Request?
    BaseUrl + endPoint (path parameters and/or query parameters)
    Headers info, content type, Authorizations
    Request Type: GET, POST, PUT, PATCH or DELETE
    Might have a Request Body 
  - How to read and verify Response?
    Status Code
    Depending on the requirements, we will verify headers and body
    Body Verification: path, jsonpath, POJO, Java Classes, Hemcrest Matchers