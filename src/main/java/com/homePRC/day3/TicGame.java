package com.homePRC.day3;

import java.util.Random;
import java.util.Scanner;

public class TicGame {
    public static void main(String[] args) {
        char[] c = new char[9];
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("請選擇位置(0~8): ");
            int pos = sc.nextInt();
            if(c[pos] == '\u0000') {
                c[pos] = 'O';

            }

        } while (true);

    }

    public static void pcRun(char[] c) {
        while(true) {
            int pos = new Random().nextInt(c.length);
            if(c[pos] == '\u0000') {
                c[pos] = 'X';
                break;
            }
        }
    }
    


}
