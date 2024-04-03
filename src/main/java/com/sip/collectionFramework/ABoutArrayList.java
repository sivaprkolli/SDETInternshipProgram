package com.sip.collectionFramework;

import java.util.*;

public class ABoutArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Selenium");
        list.add("Appium");
        list.add("Playwright");
        list.add("WebDriverIO");

        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Selenium");
        arrayList.add("Appium");
        arrayList.add("Playwright");
        arrayList.add("WebDriverIO");

        System.out.println(arrayList);



        for(String s: arrayList){
            System.out.println(s);
        }

        System.out.println("***************************************************************");
        Iterator iterator = arrayList.iterator();
      /*
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
       // System.out.println(iterator.next());
        System.out.println(iterator.hasNext()); */

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("***************************************************************");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(3));
        arrayList.set(3, "RestAssured");
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.size());
        System.out.println(arrayList.addAll(list));
        //System.out.println(arrayList.lastIndexOf());
        Collections.sort(arrayList);

       for(String a: arrayList){
           System.out.println(a);
       }

    }
}
