package com.company;

import java.util.Scanner;

public class if25 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();

    double fx;

        if (x < -2) {
            fx = 2 * x;
    } else {
            fx = -3 * x;
    }
        if (x > 2) {
            fx = 2 * x;
        }

        System.out.println(fx);

    }
}
