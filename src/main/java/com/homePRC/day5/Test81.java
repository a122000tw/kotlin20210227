package com.homePRC.day5;

public class Test81 {
    public static void main(String[] args) {
        int[][] arr2 = {{0, 1, 2}, {9, 9, 9, 9}};
        System.out.print(arr2[0].length + " ");
        System.out.print(arr2[1].getClass().isArray() + " ");
        System.out.print(arr2[0][1]);
    }
}
