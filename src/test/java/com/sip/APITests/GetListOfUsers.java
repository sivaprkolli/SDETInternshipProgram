package com.sip.APITests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetListOfUsers {

    @Test
    public void getListOfUserAndValidateResponse(){
        Response response =
                given()
                .queryParam("page","2")
                .when()
                .get("https://reqres.in/api/users");

        String email = response
                .then()
                .extract()
                .path("data[0].email").toString();

        String pagesNumber = response
                .then()
                .extract()
                .path("per_page").toString();

        System.out.println(email);
        System.out.println(pagesNumber);

        Assert.assertTrue(response.statusCode()==200);
    }

    @Test
    public void verifyResponse(){
        Response response = when().get("https://reqres.in/api/users?page=2");
        String output = response.asPrettyString();
        System.out.println(output);
        Assert.assertTrue(response.statusCode()==200);
    }
}
