package com.homePRC.day5;

public class Test5 {
    public static String maskId(String id) {
        String x = "oooo-oooo-oooo-";
        //return x + id.substring(15, 19);
        StringBuilder sb = new StringBuilder(id);
        StringBuilder s = sb.insert(0, x);
        //sb.append(id, 15, 19);
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskId("1234-5678-9012-3456"));
    }

}
