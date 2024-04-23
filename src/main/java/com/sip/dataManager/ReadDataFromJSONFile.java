package com.sip.dataManager;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadDataFromJSONFile {

    @Test
    public void createJsonObject(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Selenium", 4);
        map.put("Appium", 2);
        map.put("Playwright", 1);
        map.put("WebDriverIO", 7);

        System.out.println(map);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Selenium", 4);
        jsonObject.put("Appium", 2);
        jsonObject.put("Playwright", 1);
        jsonObject.put("WebDriverIO", 7);

        System.out.println(jsonObject);
    }

    public static String getJsonBody(String filePath) {
        try {
            ObjectMapper m = new ObjectMapper();
            JsonNode rootNode = m.readTree(new File(filePath));
            return rootNode.toPrettyString();
        }catch (Exception e){
            System.err.println("Something wrong with specified file: "+filePath);
            return null;
        }
    }

    @Test
    public void readDataFromJSONFile() throws IOException, ParseException {
        System.out.println(getJsonBody(System.getProperty("user.dir")+ "/androidDevice.json"));
    }
}
