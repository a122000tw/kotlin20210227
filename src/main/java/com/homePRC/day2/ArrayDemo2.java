package com.homePRC.day2;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] lens = {100, 90, 80};
        int[] wids = new int[] {30, 20, 10};
        for(int i = 0; i < lens.length; i++) {
            System.out.println(lens[i] + " ");
        }
        for(int i = 0; i < wids.length; i++) {
            System.out.println(wids[i] + " ");
        }
        System.out.println("---------------------");

        for(int i = 0; i < lens.length; i++) {
            int area = lens[i] * wids[i];
            System.out.println(area + " ");
        }
        System.out.println("---------------------");
        for(int i = 0; i < lens.length; i++) {
            for(int j = 0; j < wids.length; j++) {
                int area = lens[i] * wids[j];
                System.out.println(area + " ");
            }


        }


    }
}
