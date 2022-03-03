package com.company;

import java.util.Scanner;

public class if12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(Math.min(a, Math.min(b,c)));
    }
}
