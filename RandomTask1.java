package com.test;

import java.util.Random;
import java.util.Date;
public class RandomTask1 {
    public static void main(String[] args) {
        RandomTask1 a = new RandomTask1();
        a.task1();
        ////////////
        a.task2();
        ////////////
        a.task3();
        a.task4();

        System.out.println(-3%4);
    }
    void task1() {
        System.out.println("Silence is golden");
    }
    void task2(){
        String weekday = "суббота";
        String month = "март";
        String name = "Валентин";
        System.out.println(weekday + "\n" + month + "\n" + name);
    }
    void task3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(0);
            }
            System.out.println();
        }
    }
    void task4(){
            for (int i=0; i<5; i++){
                for (int j=0; j<8;j++){
                    System.out.print("a ");
                }
                System.out.println();
            }
        }
}


