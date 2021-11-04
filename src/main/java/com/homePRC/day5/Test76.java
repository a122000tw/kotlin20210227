package com.homePRC.day5;

public class Test76 {
    public static void main(String[] args) {
        float f1 = (88_88.001 >= 888_8.00) ? 1_234 : 12_34.02f;
        float f2 = f1 + 1024;
        System.out.println(f2);
        System.out.println(f1);
        if(88_88.001 >= 888_8.00) {
            System.out.println(1234);
        } else {
            System.out.println(1234.02);
        }
    }
}
