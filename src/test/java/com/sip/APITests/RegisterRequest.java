package com.sip.APITests;

import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RegisterRequest {

    @Test
    public void verifyPostRequest() throws IOException {
        Map<String, String> payload = new HashMap<>();
        payload.put("email", "eve.holt@reqres.in");
        payload.put("password","pistol");
        System.out.println(payload);

        byte[] body;
        File file = new File("./credentials.json");
        body = Files.readAllBytes(file.toPath());

        Response response=
                given()
                        .body(body)
                        .contentType("application/json")
                        .when()
                        .header("content-type","application/json")
                        .post("https://reqres.in/api/register");


        String output = response.asPrettyString();
        System.out.println(output);

        String idValue = response
                .then()
                .extract()
                .path("id").toString();

        System.out.println(idValue);
    }
}
