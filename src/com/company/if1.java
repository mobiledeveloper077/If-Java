package com.company;

import java.util.Scanner;

public class if1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            ++a;
        }
        System.out.println(a);
    }
}
