package com.homePRC.day4;

public class Test72 {
    public static void main(String[] args) {
        int value = 41;
        if(value >= 0) {
            if(value != 0)
                System.out.println("the");
            else
                System.out.println("quick");
            if(value < 25)
                System.out.println("brown");
            if(value > 40)
                System.out.println("fox");
            else if(value < 50)
                System.out.println("jumps");
            else if(value < 25)
                System.out.println("over");
            else
                System.out.println("the");
            if(value > 25)
                System.out.println("lazy");
        } else {
            System.out.println("cat");
        }
        System.out.println("...");
    }
}
