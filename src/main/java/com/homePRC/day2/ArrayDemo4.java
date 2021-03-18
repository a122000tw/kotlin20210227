package com.homePRC.day2;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] scores = {40, 70, 30, 90, 100};

        int count = 0;
        int sum = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] >= 60) {
                count += 1;
                sum += scores[i];
            }
        }
        System.out.printf("count = %d sum = %d \n", count, sum);
        System.out.printf("%.1f\n", (double)sum/count);

        System.out.println("-------------------------------");
        double avg = Arrays.stream(scores).filter(s -> s >= 60).average().getAsDouble();
        System.out.printf("%.1f\n", avg);

    }
}
