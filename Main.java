package com.onest;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        //primitive type
        int myAge = 30;
        long  viewCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isElegible = false;
        // refrence
        Date now = new Date();
        System.out.println(now);

        System.out.println(myAge);
        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);

        }
        // diff between primitive and refrence

        //primitive
        int x = 1;
        int y = x;
        x=2;
        System.out.println(y);
     // refrence
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x =5;
        System.out.println(point2);
    }
}

