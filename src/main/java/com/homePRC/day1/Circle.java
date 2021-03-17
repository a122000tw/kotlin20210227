package com.homePRC.day1;

public class Circle {
    static String name;
    int r;
    double area;
    void print() {
        area = r * r * Math.PI;
        System.out.println(name);
        System.out.println(r);
        System.out.println(area);
    }

}
