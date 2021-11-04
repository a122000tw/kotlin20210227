package com.homePRC.day4;

public class Test23 {
    public static String maskId(String id) {
        String x = "0000-0000-0000-";
        // line nl
//        StringBuilder sb = new StringBuilder(x);
//        sb.append(id, 15, 19);
//        return sb.toString();
        return x + id.substring(15, 19);
    }

    public static void main(String[] args) {
        System.out.println(maskId ("1234-5678-9012-3456"));
    }
}
