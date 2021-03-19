package com.homePRC.day3;

public class StringDemo3 {
    public static void main(String[] args) {
        String s = "Java";
        s = add(s);
        System.out.println(s);

    }

    public static String add(String s) {
        s = s.concat(" 8");
        return s;
    }
}
