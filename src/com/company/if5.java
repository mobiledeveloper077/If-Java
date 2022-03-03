package com.company;

import java.util.Scanner;

public class if5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = 0;
        int t = 0;
        if (a > 0) {
            k++;
        } else {
            t++;
        }
        if (b > 0) {
            k++;
        } else {
            t++;
        }
        if (c > 0) {
            k++;
        } else {
            t++;
        }
        System.out.println(k);
        System.out.println(t);
    }
}
