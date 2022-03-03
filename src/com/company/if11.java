package com.company;

import java.util.Scanner;

public class if11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c;

        if (a > b) {
            c = a;
        } else {
            c = 0;
        }
        if (b > a) {
            c = b;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
