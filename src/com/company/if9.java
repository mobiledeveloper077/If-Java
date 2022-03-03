package com.company;

import java.util.Scanner;

public class if9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double max;
        double min;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        a = min;
        b = max;
        System.out.println(a);
        System.out.println(b);
    }
}
