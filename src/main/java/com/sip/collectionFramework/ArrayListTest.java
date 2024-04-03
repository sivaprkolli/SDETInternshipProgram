package com.sip.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        int i = 10;
        int[] j = {1,2,3,4,5,5,6};

        List list = new ArrayList();
        list.add("Appium");
        list.add(2);

        String l = list.get(1).toString();
        System.out.println(l);
        int k = Integer.parseInt(l);
        System.out.println(k);
    }
}
