package com.company;

import java.util.Scanner;

public class if10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;

        if (a != b) {
            a = c;
            b = c;
            System.out.println(a);
            System.out.println(b);
        } else {
            a = 0;
            b = 0;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
