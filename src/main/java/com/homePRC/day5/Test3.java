package com.homePRC.day5;

public class Test3 {
    public static void main(String[] args) {
        String s = "123";
        if (s.length() > 2 ) {
            s.concat("456");
            System.out.println(s);
        }
        for (int i =0; i < 3; i++) {
            s += "z";
            System.out.println(i);
            System.out.println(s);
        }
    }
}
