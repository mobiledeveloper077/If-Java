package com.company;

import java.util.Scanner;

public class if18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b) {
            c = 3;
            System.out.println(c);
        }
        if (b == c) {
            a = 1;
            System.out.println(a);
        }
        if (a == c) {
            b = 2;
            System.out.println(b);
        }
    }
}
