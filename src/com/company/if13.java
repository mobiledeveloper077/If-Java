package com.company;

import java.util.Scanner;

public class if13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double sum = a + b + c;
        double max = Math.max(a, Math.max(b, c));
        double min = Math.min(a, Math.min(b, c));

        double middle = sum - (max + min);

        System.out.println(middle);
    }
}
