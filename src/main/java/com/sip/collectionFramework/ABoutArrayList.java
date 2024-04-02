package com.sip.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ABoutArrayList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Selenium");
        list.add("Appium");
        list.add("Playwright");
        list.add("WebDriverIO");

        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Selenium");
        arrayList.add("Appium");
        arrayList.add("Playwright");
        arrayList.add("WebDriverIO");

        System.out.println(arrayList);

        for(String s: arrayList){
            System.out.println(s);
        }
    }
}
