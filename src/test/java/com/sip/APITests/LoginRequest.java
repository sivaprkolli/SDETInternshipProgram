package com.sip.APITests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class LoginRequest {
    @Test
    public void verifyPostRequest(){
        Map<String, String> payload = new HashMap<>();
        payload.put("email", "eve.holt@reqres.in");
        payload.put("password","cityslicka");

        System.out.println(payload);

        Response response=
                given()
                        .body(payload)
                        .contentType("application/json")
                        .when()
                        .header("content-type","application/json")
                        .post("https://reqres.in/api/login");


        String output = response.asPrettyString();
        System.out.println(output);

        String bodyValue = response.then().extract().path("token").toString();
        System.out.println(bodyValue);

        Assert.assertFalse(bodyValue.isEmpty());

        Assert.assertTrue(response.statusCode()==200);

    }
}
