package com.company;

import java.util.Scanner;

public class if4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = 0;
        if (a > 0) {
            k++;
        }
        if (b > 0) {
            k++;
        }
        if (c > 0) {
            k++;
        }
        System.out.println(k);
    }
}
