package org.ExtraTestCases.Steps.API;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import net.serenitybdd.annotations.Managed;
import org.ExtraTestCases.Data.UserLogin;
import org.ExtraTestCases.Data.Users;
import org.ExtraTestCases.Operation.AutomationExerciseOperation.*;

import static org.ExtraTestCases.Data.Users.userLogin;
import static org.ExtraTestCases.Operation.AutomationExerciseOperation.DELETE;


public class AutomationExerciseAPISteps {

    @Then("I delete the user")
    @After(value = "@DeleteUserWhenItHasBeenCreated")
    public void deleteUserUsingAPI(){


        RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();

        Response response = requestSpecification.given().baseUri(DELETE.getDomain()).
                contentType(DELETE.getContentType()).
                multiPart("email", userLogin.getEmail()).
                multiPart("password", userLogin.getPassword()).
                when().
                request(DELETE.getOperationType().getOperationName(), DELETE.getEndpoint());

    }
}
