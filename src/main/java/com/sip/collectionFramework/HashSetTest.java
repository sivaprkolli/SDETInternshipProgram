package com.sip.collectionFramework;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Collection set = new HashSet();
        set.add("Appium");
        set.add("RestAssured");
        set.add("RestSharp");
        set.add("Detox");
        set.add("Selenium");
        set.add("Playwright");
        set.add("Playwright");

        System.out.println(set);

        for(Object s: set){
            System.out.println(s.toString());
        }


        SortedSet sSet = new TreeSet();
        sSet.add("Appium");
        sSet.add("RestAssured");
        sSet.add("RestSharp");
        sSet.add("Detox");
        sSet.add("Selenium");
        sSet.add("Playwright");
        sSet.add("Playwright");

        System.out.println(sSet);

        ArrayList<String> list = new ArrayList<String>();
        list.add("Appium");
        list.add("RestAssured");
        list.add("RestSharp");
        list.add("Detox");
        list.add("Selenium");
        list.add("Playwright");
        list.add("Playwright");
        System.out.println(list);

    }
}
