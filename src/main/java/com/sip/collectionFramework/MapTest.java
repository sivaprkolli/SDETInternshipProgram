package com.sip.collectionFramework;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap();
        map.put("Selenium", 4.0);
        map.put("Appium", 2.0);
        map.put("Playwright", 2.0);
        map.put("RestAssured", 16.0);
        map.put("WebDriverIO", 17.0);
        map.put("Playwright", 2.16);
        map.put(null, null);
        map.put(null, 12.0);

        System.out.println(map);


        Map<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Selenium", 4.0);
        treeMap.put("Appium", 2.0);
        treeMap.put("Playwright", 2.0);
        treeMap.put("RestAssured", 16.0);
        treeMap.put("WebDriverIO", 17.0);
        treeMap.put("Playwright", 2.16);
       treeMap.put("Test", null);

        System.out.println(treeMap);
    }

}
