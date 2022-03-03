package com.company;

import java.util.Scanner;

public class if16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a < b && b < c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a *= -1;
            b *= -1;
            c *= -1;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
