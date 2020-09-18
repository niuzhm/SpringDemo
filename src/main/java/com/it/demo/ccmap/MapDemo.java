package com.it.demo.ccmap;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("niu","ming");
        map.put("niu", "yi");
        System.out.println(map.get("niu"));
    }
}
