package org.example.baekjoon.step2;

import java.util.Scanner;

public class _14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();


        if (x > 0 && x <= 1000 && 0 < y && y <= 1000) {
            System.out.println("1");
        }
        if (x < 0 && x >= -1000 && 0 < y && y <= 1000) {
            System.out.println("2");
        }
        if (x < 0 && x >= -1000 && 0 > y && y >= -1000) {
            System.out.println("3");
        }
        if (x > 0 && x <= 1000 && 0 > y && y >= -1000) {
            System.out.println("4");
        }
    }
}
