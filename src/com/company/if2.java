package com.company;

import java.util.Scanner;

public class if2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;

        if (a > 0) {
            b = a+1;
        } else {
            b = a-2;
        }

        System.out.println(b);
    }
}
