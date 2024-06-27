package com.sip.APITests;

import io.restassured.response.Response;
import org.apache.http.entity.ContentType;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static io.restassured.RestAssured.*;

public class PostAGame {

    public String loginRequestBody() {
        JSONObject login = new JSONObject();
        login.put("username", "admin");
        login.put("password", "admin");
        String data = login.toString();
        System.out.println(data);
        return data;
    }

    @Test
    public void createToken() throws IOException {
        Response tokenResponse =
                given()
                        .header("content-type","application/json")
                        .body(loginRequestBody())
                        .when()
                        .post("https://videogamedb.uk/api/authenticate");

        System.out.println(tokenResponse.asPrettyString());

        String token =

                tokenResponse
                .then()
                .extract()
                .path("token").toString();

        System.out.println("output :: " + token);


        byte[] bytes;
        File file = new File("./game.json");
        bytes = Files.readAllBytes(file.toPath());


        Response postGameResponse =
                given()
                        .header("content-type","application/json")
                        .header("Authorization", "Bearer " + token)
                        .body(bytes)
                        .when()
                        .post("https://videogamedb.uk/api/videogame");

        System.out.println(postGameResponse.asPrettyString());

        String response =
                postGameResponse
                        .then()
                        .extract()
                        .path("category").toString();
        Assert.assertEquals(response, "Platform");


    }
}
