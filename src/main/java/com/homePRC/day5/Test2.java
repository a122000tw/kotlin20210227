package com.homePRC.day5;

public class Test2 {

    public static void main(String[] args) {
        String s1 = "Duke";
        String[] strArr = {"D","u","k","e"};
        String s3 = "";
        for (String s : strArr) {
            s3 = s3 + s;
        }
        boolean b1 = (s1 == s3);
        boolean b2 = (s1.equals(s3));
        System.out.println(b1 + "," + b2);

    }
}
