package com.shreyannag;

import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of data: ");
        size = sc.nextInt();
        int a[] = new int[size];
        int t, i, j;
        System.out.println("\nEnter data one by one is any order you may like:\n");
        for (i = 0; i < size; i++)
            a[i] = sc.nextInt();

        for (i = 0; i < size; i++) {
            for (j = 0; j < size - 1; j++)
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
        }
        System.out.println("\nData in ascending order below as follows:\n");
        for (i = 0; i < size; i++)
            System.out.println(a[i]);
    }
}
