package com.homePRC.day2;

import java.util.Arrays;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] radius = {10, 20, 30};

        for(int i = 0; i < radius.length; i++) {
            double area = Math.pow(radius[i], 2) * Math.PI;
            System.out.printf("%.2f\n", area);
        }
        for(int r:radius) {
            double area = Math.pow(r,2) * Math.PI;
            System.out.printf("%.2f\n", area);
        }
        System.out.println("-------------------------");
        Arrays.stream(radius).forEach(r -> {
            double area = Math.pow(r,2) * Math.PI;
            System.out.printf("%.2f\n", area);
        });
        System.out.println("-------------------------");
        Arrays.stream(radius).forEach(r -> System.out.printf("%.2f\n", Math.pow(r,2) * Math.PI));

    }
}
