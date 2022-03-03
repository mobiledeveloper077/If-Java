package com.company;

import java.util.Scanner;

public class if26 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();

    double fx;

        if (x <= 0) {
            fx = -x;
    } else {
            fx = Math.pow(x,2);
    }
        if (x >= 2) {
            fx = 4;
        }

        System.out.println(fx);

    }
}
