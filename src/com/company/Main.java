package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();

            for (int j = n; j > 0; j--) {

                if (i + 1 == n) {
                    if (j <= i) System.out.print("*");
                    else System.out.print(" ");
                } else {
                    if (j == i) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            for (int j = 0; j < i + 1; j++) {
                if (i + 1 == n) {
                    if (j <= i) System.out.print("*");
                    else System.out.print(" ");
                } else {
                    if (j == i) System.out.print("*");
                    else System.out.print(" ");

                }
            }
        }
        System.out.println();
    }
}
