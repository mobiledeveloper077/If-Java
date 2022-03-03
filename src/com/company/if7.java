package com.company;

import java.util.Scanner;

public class if7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = Math.min(a,b);
        if (c == a) {
            c = 1;
            System.out.println(a);
        } else {
            c = 2;
            System.out.println(b);
        }
        System.out.println(c);
    }
}
